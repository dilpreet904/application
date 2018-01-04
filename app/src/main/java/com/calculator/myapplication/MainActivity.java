package com.calculator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    private Button b;
    private String disp = "";
    private String o = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.textView);
        t.setText(disp);
    }

    protected void onClickNumber(View v) {
        b = (Button) v;
        disp = disp + b.getText();
        t.setText(disp);
    }

    private void clear() {
        disp = "";
        o = "";

    }

    protected void onClickClear(View v) {
        clear();
        t.setText(disp);
    }

    protected void onClickEqual(View v) {
        b = (Button) v;
        disp = disp + b.getText();
        t.setText(disp);
    }

    protected void onClickOperator(View v) {
        b = (Button) v;
        disp = disp + b.getText();
        o = b.getText().toString();
        t.setText(disp);

    }

}

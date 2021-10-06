package com.calculator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

     TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=(TextView)findViewById(R.id.textView2);
        String abc=getIntent().getStringExtra("name");
        textView2.setText(abc);
        textView3=(TextView)findViewById(R.id.textView3);
        String var=getIntent().getStringExtra("Id");
        textView3.setText(var);
    }
}

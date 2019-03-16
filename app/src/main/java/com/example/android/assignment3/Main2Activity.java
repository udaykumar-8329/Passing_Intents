package com.example.android.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        tv=findViewById(R.id.tv);
        Intent intent=getIntent();
        String message=intent.getStringExtra("one");
        tv.setText(message);
        setContentView(tv);

        }
}

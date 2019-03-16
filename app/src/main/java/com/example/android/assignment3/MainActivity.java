package com.example.android.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view) {

            String MESSAGE_KEY="klsdjflsadjflakdjflasdjflkasdjf;lajsdflkajd;lfjasdlfja;lsdjfa;";
        Intent intent=new Intent(this,Main2Activity.class);
       // intent.putExtra("one","MESSAGE_KEY");
        intent.putExtra("one",MESSAGE_KEY);
        startActivity(intent);

    }

    public void two(View view) {

        String Value="jdslkjfalksdjfl;skdajfl;akdjflkksdajf;lkaskdjf;lkasd";
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("two",Value);
        startActivity(intent);

    }

    public void three(View view) {

        String Value="sdlkfkjasdlkkfjalskd;kfjalsdjf;alkskjfd;lkaksjdjf;isjdflkajsdldkfkja;sldkkfja";
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("three",Value);
        startActivity(intent);
    }
}

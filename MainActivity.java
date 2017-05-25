package com.example.prasathth.thisapp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void message(View view){
        Intent intent = new Intent(this , DisplayMessage.class);
        //String message = "hello" ;
        String time = DateFormat.getDateTimeInstance().format(new Date());
        intent.putExtra(EXTRA_MESSAGE , time);
        startActivity(intent);


    }
    public void message2(View view){
        Intent intent = new Intent(this , DisplayMessage.class);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date()).toString();
        intent.putExtra(EXTRA_MESSAGE , date);
        startActivity(intent);


    }
    public void message3(View view){
        Intent intent = new Intent(this , DisplayMessage.class);
        String message = "This is a app" ;
        intent.putExtra(EXTRA_MESSAGE , message);
        startActivity(intent);


    }
}

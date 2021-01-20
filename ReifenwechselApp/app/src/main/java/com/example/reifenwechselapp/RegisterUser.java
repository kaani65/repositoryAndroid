package com.example.reifenwechselapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterUser extends AppCompatActivity {

    private TextView textViewKalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");
        textViewKalender.setText(date);
    }
}
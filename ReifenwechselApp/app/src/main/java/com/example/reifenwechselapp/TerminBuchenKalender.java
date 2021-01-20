package com.example.reifenwechselapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class TerminBuchenKalender extends AppCompatActivity {

    public static final String TAG = "TerminBuchenKalender";

    private CalendarView mCalenderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termin_buchen_kalender);

        mCalenderView = (CalendarView) findViewById(R.id.calendarView);

        mCalenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1 +1) + "/" + i;

                Log.d(TAG, "onSelectedDayChange: dd/MM/YYYY: " + date);

                Intent intent = new Intent(TerminBuchenKalender.this, RegisterUser.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}
package com.example.delinev7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AssignInfo extends AppCompatActivity {
    Button delA;
    TextView assignName;
    TextView assignCourse;
    TextView assignDesc;
    TextView assignDue;
    TextView assignStartDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_info);
        Intent aiintent = getIntent();

        findViewById(R.id.cancel_btn3).setOnClickListener(v -> {
            finish();

        });
        findViewById(R.id.complete2_btn).setOnClickListener(v -> {
            Intent dintent= new Intent(this, AverageTime.class);
            startActivity(dintent);
        });

    }
}

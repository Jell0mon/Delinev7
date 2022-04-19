package com.example.delinev7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCourse extends AppCompatActivity {
    EditText course_title_edit;
    EditText course_id;
    EditText course_desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);
        Intent cintent = getIntent();


        findViewById(R.id.submit_btn2).setOnClickListener(v -> {
                finish();

        });
        findViewById(R.id.cancel_btn2).setOnClickListener(v -> {

            finish();


        });



    }
    public void backhome(){
        Intent mintent=new Intent(this, MainActivity.class);
        startActivity(mintent);
    }
}
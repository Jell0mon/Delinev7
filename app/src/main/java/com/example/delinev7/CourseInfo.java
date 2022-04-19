package com.example.delinev7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CourseInfo extends AppCompatActivity {

    TextView courseName;
    TextView courseId;
    TextView courseDesc;
    TextView assignList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);
        Intent ciintent = getIntent();

        findViewById(R.id.delete_course_btn).setOnClickListener(v -> {
            finish();
        });




    }

}
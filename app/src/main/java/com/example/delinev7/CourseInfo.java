package com.example.delinev7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CourseInfo extends AppCompatActivity {
    ArrayList<Asstitems> asstitems;

    private RecyclerView recyclerView;
    int counter=0;
    TextView coursetitle;
    TextView courseid;
    TextView coursedescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);

        coursetitle.findViewById(R.id.course_name_info);
        courseid=findViewById(R.id.course_id_info);
        coursedescription=findViewById(R.id.course_desc_info);


        Intent ciintent = getIntent();



        recyclerView= findViewById(R.id.course_assign_recycle);
        asstitems=new ArrayList<>();

        setAssignInfo();
        setAdapter();

    }
    private void setAdapter() {
        RecyclerViewAdapter adapter =new RecyclerViewAdapter(asstitems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);



    }

    private void setAssignInfo() {
        asstitems.add(new Asstitems("bob1","date"));
        asstitems.add(new Asstitems("bob2","help"));
        asstitems.add(new Asstitems("bob3","01/22/23"));



    }
}
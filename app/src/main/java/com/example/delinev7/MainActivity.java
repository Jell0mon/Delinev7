package com.example.delinev7;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ArrayList<Asstitems> asstitems;
    ArrayList<Courseitems> courseitems;
    private RecyclerView recyclerView;
    private RecyclerView recyclerViewC;
    Layout layoutA;
    int counter=0;


    Button addc;
    Button ainfo;
    Button cinfo;
    Button adda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent mintent = getIntent();

        adda=findViewById(R.id.addA);
        addc=findViewById(R.id.addC);






        adda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddAssign();
            }
        });
        addc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddCourse();
            }
        });





        recyclerView= findViewById(R.id.asst_recview);
        asstitems=new ArrayList<>();
        recyclerViewC= findViewById(R.id.course_recview);
        courseitems=new ArrayList<>();






        //String st = getIntent().getExtras().getString("value");


        setAssignInfo();
        setAssignAdapter();
        setCourseInfo();
        setCourseAdapter();







    }
    private void setAssignAdapter() {
        RecyclerViewAdapter adapter =new RecyclerViewAdapter(asstitems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);



    }

    private void setAssignInfo() {
        asstitems.add(new Asstitems("bob1","date"));
        asstitems.add(new Asstitems("bob2","help"));
        asstitems.add(new Asstitems("bob3","01/22/23"));



    }
    private void setCourseAdapter() {
        CourseRecyclerViewAdapter adapter =new CourseRecyclerViewAdapter(courseitems);
        recyclerViewC.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewC.setAdapter(adapter);



    }

    private void setCourseInfo() {
        courseitems.add(new Courseitems("Math","Math-123"));
        courseitems.add(new Courseitems("Math2","Math-123"));
        courseitems.add(new Courseitems("Math3","Math-123"));
    }

    private void openAddAssign() {
        Intent aintent= new Intent(this, AddAssign.class);
        startActivity(aintent);

    }
    private void openAddCourse() {
        Intent cintent= new Intent(this, AddCourse.class);
        startActivity(cintent);

    }
    private void openAssignInfo() {
        Intent aiintent= new Intent(this, AssignInfo.class);
        startActivity(aiintent);

    }
    private void openCourseInfo() {
        Intent ciintent= new Intent(this, CourseInfo.class);
        startActivity(ciintent);

    }

}
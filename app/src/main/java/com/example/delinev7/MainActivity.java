package com.example.delinev7;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    //array tthat stores assignment items
    ArrayList<Asstitems> asstitems;
    ArrayList<Courseitems> courseitems;
    //Recycle views the stores assignments
    private RecyclerView recyclerView;
    //Recycle views the stores course data
    private RecyclerView recyclerViewC;


    //Add Data Button
    Button addc;
    Button adda;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent mintent = getIntent();
        //OnClick buttons to input activities
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

        //Calling methods
        setAssignInfo();
        setAssignAdapter();
        setCourseInfo();
        setCourseAdapter();





    }
    private void setAssignAdapter() {
        //set tiles for assignments
        RecyclerViewAdapter adapter =new RecyclerViewAdapter(asstitems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);



    }

    private void setAssignInfo() {
        //add assignment info
        asstitems.add(new Asstitems("bob1","date"));
        asstitems.add(new Asstitems("bob2","date"));
        asstitems.add(new Asstitems("bob3","01/22/23"));
        asstitems.add(new Asstitems("bob4","date"));
        asstitems.add(new Asstitems("bob4","01/22/23"));



    }
    private void setCourseAdapter() {
        //set cards for course
        CourseRecyclerViewAdapter adapter =new CourseRecyclerViewAdapter(courseitems);
        recyclerViewC.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewC.setAdapter(adapter);

    }

    private void setCourseInfo() {
        //add course item
        courseitems.add(new Courseitems("Math","Math-123"));
        courseitems.add(new Courseitems("Math2","Math-123"));
        courseitems.add(new Courseitems("Math3","Math-123"));
    }
    //intent methods to open Add Assignment Activity and Course Activity

    private void openAddAssign() {
        Intent aintent= new Intent(this, AddAssign.class);
        startActivity(aintent);

    }
    private void openAddCourse() {
        Intent cintent= new Intent(this, AddCourse.class);
        startActivity(cintent);

    }


}
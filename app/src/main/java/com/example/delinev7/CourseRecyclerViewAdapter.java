package com.example.delinev7;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRecyclerViewAdapter extends RecyclerView.Adapter<CourseRecyclerViewAdapter.CourseViewHolder> {

    ArrayList<Courseitems> courseList;
    public  CourseRecyclerViewAdapter(ArrayList<Courseitems> courseList){
        this.courseList=courseList;
    }
    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView coursename;
        TextView courseid;
        TextView coursedescr;
        int position;
        private CourseRecyclerViewAdapter adapter;

        public CourseViewHolder(final View view) {
            super(view);
            coursename=view.findViewById(R.id.course_name);
            courseid=view.findViewById(R.id.course_id_txt);
            //coursedescr=view.findViewById(R.id.course_desc_info);
            view.findViewById(R.id.info_btn).setOnClickListener(v -> {
                //Log.d("democourse", "onclick button was clicked at" + position + "course: " + coursename + " "+ courseid );
                openActivity2(view);
            });
        }
    }

    @NonNull
    @Override
    public CourseRecyclerViewAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent,false);
        return new CourseViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(@NonNull CourseRecyclerViewAdapter.CourseViewHolder holder, int position) {
        String ctitle= courseList.get(position).getCoursename();
        String cid=courseList.get(position).getCourseID();
        //String cdesc=courseList.get(position).getCoursedesc();
        holder.coursename.setText(ctitle);
        holder.courseid.setText(cid);
        //holder.coursedescr.setText(cdesc);
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
    public void openActivity2(View view){
        Intent ciintent= new Intent(view.getContext(),CourseInfo.class);
        view.getContext().startActivity(ciintent);

    }

}

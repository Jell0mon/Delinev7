package com.example.delinev7;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    ArrayList<Asstitems> asstList;

    public RecyclerViewAdapter(ArrayList<Asstitems> asstList) {
        this.asstList = asstList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView asstname;
        TextView datetxt;
        int position;


        private RecyclerViewAdapter adapter;

        public MyViewHolder(final View view) {
            super(view);
            asstname = view.findViewById(R.id.title_txt);
            datetxt = view.findViewById(R.id.date_txt);




            view.findViewById(R.id.test_btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("demo", "onclick button was clicked at" + position + "user: " + asstname);
                    openActivity(view);
                }
            });
        }
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tile, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        String name = asstList.get(position).getAsstname();
        String ddate = asstList.get(position).getAsstdate();


        holder.asstname.setText(name);
        holder.datetxt.setText(ddate);


    }

    @Override
    public int getItemCount() {
        return asstList.size();
    }
    public void openActivity(View view){
        Intent someintent= new Intent(view.getContext(),AssignInfo.class);
        view.getContext().startActivity(someintent);

    }

}
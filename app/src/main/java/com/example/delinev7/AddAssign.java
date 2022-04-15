package com.example.delinev7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AddAssign extends MainActivity {
    LinearLayout layoutA;
    EditText titletext;
    String newtitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_assign);
        Intent aintent=getIntent();







        findViewById(R.id.submit_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                backhome();
            }

        });
        findViewById(R.id.cancel_btn).setOnClickListener(v -> {

            backhome();


        });
    }
    public void backhome(){
        Intent mintent=new Intent(this, MainActivity.class);
        startActivity(mintent);
    }





}
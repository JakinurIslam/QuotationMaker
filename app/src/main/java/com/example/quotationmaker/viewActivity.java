package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class viewActivity extends AppCompatActivity {
    Button vbf;
    Button vprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        vbf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent bf_intent = new Intent(viewActivity.this,viewActivity.class);
                startActivity(bf_intent);


            }
        });
        vprint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent print_intent = new Intent(viewActivity.this,viewActivity.class);
                startActivity(print_intent);


            }
        });
    }
}

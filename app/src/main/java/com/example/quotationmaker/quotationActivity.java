package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class quotationActivity extends AppCompatActivity {
    Button qdelete;
    Button qadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation);
        qdelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent delete_intent = new Intent(quotationActivity.this,viewActivity.class);
                startActivity(delete_intent);


            }
        });
        qadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent add_intent = new Intent(quotationActivity.this,viewActivity.class);
                startActivity(add_intent);


            }
        });
    }
}

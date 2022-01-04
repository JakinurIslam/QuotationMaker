package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {
    Button hprofile;
    Button hemployee;
    Button hproduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        hprofile = findViewById(R.id.hprofile);
        hemployee = findViewById(R.id.hemployee);
        hproduct = findViewById(R.id.hproduct);
        hprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent= new Intent (HomeActivity.this,profileActivity.class);
                startActivity(profileIntent);
            }
        });
        hemployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent employeeIntent= new Intent (HomeActivity.this,employeeActivity.class);
                startActivity(employeeIntent);
            }
        });
        hproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent productIntent= new Intent (HomeActivity.this,productActivity.class);
                startActivity(productIntent);
            }
        });
    }

}

package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class employeeActivity extends AppCompatActivity {
    Button eview;
    Button equotation;
    Button ebill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        eview = findViewById(R.id.eview);
        equotation = findViewById(R.id.equotation);
        ebill = findViewById(R.id.ebill);
        eview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent view_intent = new Intent(employeeActivity.this,viewActivity.class);
                startActivity(view_intent);


            }
        });
        equotation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent quotation_intent = new Intent(employeeActivity.this,quotationActivity.class);
                startActivity(quotation_intent);


            }
        });
        ebill.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent bill_intent = new Intent(employeeActivity.this,billActivity.class);
                startActivity(bill_intent);


            }
        });


    }
}

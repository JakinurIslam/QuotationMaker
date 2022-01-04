package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class billActivity extends AppCompatActivity {
    Button bsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        bsave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sav_intent = new Intent(billActivity.this,employeeActivity.class);
                startActivity(sav_intent);


            }
        });
    }
}

package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button jnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jnext = findViewById(R.id.jnext);
        jnext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_one = new Intent(MainActivity.this,adminActivity.class);
                startActivity(intent_one);


            }
        });
    }
}

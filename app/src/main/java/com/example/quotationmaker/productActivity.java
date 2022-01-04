package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import org.w3c.dom.Text;

public class productActivity extends AppCompatActivity {
    Button pupdate;
    Button psave;
    Button pdelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        pupdate = findViewById(R.id.pupdate);
        psave = findViewById(R.id.psave);
        pdelete = findViewById(R.id.pdelete);
        pupdate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent update_intent = new Intent(productActivity.this,productActivity.class);
                startActivity(update_intent);


            }
        });
        psave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent save_intent = new Intent(productActivity.this,productActivity.class);
                startActivity(save_intent);


            }
        });
        pdelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent delete_intent = new Intent(productActivity.this,productActivity.class);
                startActivity(delete_intent);


            }
        });
    }
}

package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class profileActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText rcompanyname;
    EditText rcompanyaddress;
    EditText radminusername;
    EditText ruserpassword;
    EditText rconfirmpassword;
    EditText rcompanylogo;
    Button rcreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        db = new DatabaseHelper(this);
        rcompanyname = (EditText)findViewById(R.id.ucompanyname);
        rcompanyaddress = (EditText)findViewById(R.id.ucompanyaddress);
        radminusername = (EditText)findViewById(R.id.uadminusername);
        ruserpassword = (EditText)findViewById(R.id.uuserpassword);
        rconfirmpassword = (EditText)findViewById(R.id.uconfirmpassword);
        rcompanylogo = (EditText) findViewById(R.id.ucompanylogo);
        rcreate = (Button) findViewById(R.id.usave);
        rcreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saveIntent= new Intent (profileActivity.this,HomeActivity.class);
                startActivity(saveIntent);
            }
        });
    }
}

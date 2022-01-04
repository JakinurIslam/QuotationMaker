package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class adminActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText ucname;
    EditText caddress;
    EditText uname;
    EditText pword;
    EditText cpassword;
    EditText uclogo;
    Button create;
    TextView alreadyregistered;
    TextView ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        db = new DatabaseHelper(this);
        ucname = (EditText)findViewById(R.id.rcompanyname);
        caddress = (EditText)findViewById(R.id.rcompanyaddress);
        uname = (EditText)findViewById(R.id.radminusername);
        pword = (EditText)findViewById(R.id.ruserpassword);
        cpassword = (EditText)findViewById(R.id.rconfirmpassword);
        uclogo = (EditText) findViewById(R.id.rcompanylogo);
        create = (Button) findViewById(R.id.rcreate);
        alreadyregistered = (TextView) findViewById(R.id.ralreadyregistered);
        ln = (TextView) findViewById(R.id.rln);
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(adminActivity.this, loginActivity.class);
                startActivity(loginIntent);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cname = ucname.getText().toString().trim();
                String address = caddress.getText().toString().trim();
                String username = uname.getText().toString().trim();
                String password = pword.getText().toString().trim();
                String cpw = cpassword.getText().toString().trim();
                String logo = uclogo.getText().toString().trim();

                if (password.equals(cpw)) {
                    db.addUser(cname,address,username,password,cpw,logo);
                    Toast.makeText(adminActivity.this, "Register Success", Toast.LENGTH_SHORT).show();
                    Intent log = new Intent(adminActivity.this,loginActivity.class);
                    startActivity(log);

                    }
                else {
                    Toast.makeText(adminActivity.this, "password not match", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}

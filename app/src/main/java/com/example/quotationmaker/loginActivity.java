package com.example.quotationmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    EditText uname;
    EditText pword;
    Button login;
    TextView forotpassword;
    TextView register;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);
        uname = (EditText)findViewById(R.id.lusername);
        pword = (EditText)findViewById(R.id.luserpassword);
        login = (Button) findViewById(R.id.llogin);
        forotpassword = (TextView) findViewById(R.id.lforotpassword);
        register = (TextView) findViewById(R.id.lregister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent= new Intent (loginActivity.this,HomeActivity.class);
                startActivity(registerIntent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = uname.getText().toString().trim();
                String password = pword.getText().toString().trim();
                Boolean res = db.checkUser(username, password);

                if (res == true)
                {
                    Toast.makeText(loginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    Intent login= new Intent (loginActivity.this,HomeActivity.class);
                    startActivity(login);
                }
                else
                {
                    Toast.makeText(loginActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

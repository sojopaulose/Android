package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText usr,pwd;
String u="Soji";
String p="abc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v){
        if (v.getId() == R.id.loginButton) {
            usr = (EditText) findViewById(R.id.username);
            pwd = (EditText) findViewById(R.id.password);
            String a = usr.getText().toString();
            String b = pwd.getText().toString();
            if (a.equals(u) && b.equals(p))
                Toast.makeText(this, "login successfull", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "invalid login", Toast.LENGTH_SHORT).show();

        }


    }
}

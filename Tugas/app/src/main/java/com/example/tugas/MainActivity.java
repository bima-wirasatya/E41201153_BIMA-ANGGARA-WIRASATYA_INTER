package com.example.tugas;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Login;
    EditText txtusername, txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = findViewById(R.id.btnLogin);

        txtusername = findViewById(R.id.username);
        txtpassword = findViewById(R.id.password);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = txtusername.getText().toString();
                String paswd = txtpassword.getText().toString();
                if (uname.equals("admin") && paswd.equals("admin")){
                    Toast.makeText(MainActivity.this,"WELCOME "+uname,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, mainMenu2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void Clear(View view){
        txtusername.setText("");
        txtpassword.setText("");
        txtusername.requestFocus();
    }
}
package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class mainMenu2 extends AppCompatActivity {

    ImageView dmc, valo, pgr;
    TextView txtdmc, txtvalo, txtpgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu2);

        dmc = findViewById(R.id.dmcPict);
        txtdmc = findViewById(R.id.dmctext);
        dmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainMenu2.this,"THIS GAME CALLED DEVIL MAY CRY", Toast.LENGTH_SHORT).show();
            }
        });

        valo = findViewById(R.id.valoPict);
        txtvalo = findViewById(R.id.valotext);
        valo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainMenu2.this,"THIS GAME CALLED VLORANT", Toast.LENGTH_SHORT).show();
            }
        });

        pgr = findViewById(R.id.pgrPict);
        txtpgr = findViewById(R.id.pgrtext);
        pgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainMenu2.this,"THIS GAME CALLED PUNISHING GRAY RAVEN", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void Back(View view) {
        Intent intent = new Intent(mainMenu2.this, MainActivity.class);
        startActivity(intent);
    }
}
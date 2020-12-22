package com.example.ejerciciodia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText name = findViewById(R.id.name);
        EditText last_name =findViewById(R.id.lastname);
        EditText email = findViewById(R.id.email);
        EditText pass = findViewById(R.id.pass);





    }
}
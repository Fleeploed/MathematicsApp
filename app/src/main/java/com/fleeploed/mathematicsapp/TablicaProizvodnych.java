package com.fleeploed.mathematicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TablicaProizvodnych extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablica_proizvodnych);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Таблица производных и интегралов");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //back formulasActivity

        FloatingActionButton fab = findViewById(R.id.calculator_TablicaProizvodnych);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TablicaProizvodnych.this, Calculator.class);
                startActivity(intent);
            }
        });
    }

}

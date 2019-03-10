package com.fleeploed.mathematicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AlgGeom6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_geom6);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("6. Решение задач");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FloatingActionButton fab = findViewById(R.id.calculator_AlgGeom6);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlgGeom6.this, Calculator.class);
                startActivity(intent);
            }
        });

    }

}

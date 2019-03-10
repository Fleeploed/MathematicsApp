package com.fleeploed.mathematicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AlgGeom3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_geom3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("3. Решение задач");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FloatingActionButton fab = findViewById(R.id.calculator_AlgGeom3);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlgGeom3.this, Calculator.class);
                startActivity(intent);
            }
        });

    }

}

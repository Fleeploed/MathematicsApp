package com.fleeploed.mathematicsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class FormulSokr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formul_sokr);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Формулы сокращенного умножения");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public void finish() {
        getSupportActionBar();
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // animation for slide
    }
}

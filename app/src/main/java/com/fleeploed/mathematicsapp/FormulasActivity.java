package com.fleeploed.mathematicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FormulasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Основные формулы");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button buttonForPriznaki = (Button) findViewById(R.id.button_priznaki);
        buttonForPriznaki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,Priznakidelimosti.class);
                startActivity(intent);
            }
        });

        Button buttonForModul = (Button) findViewById(R.id.button_modul_korni);
        buttonForModul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,ModulFomulas.class);
                startActivity(intent);
            }
        });

        Button buttonForSokr = (Button) findViewById(R.id.button_formul_sokr_umn);
        buttonForSokr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,FormulSokr.class);
                startActivity(intent);
            }
        });


        Button buttonForProgresii = (Button) findViewById(R.id.button_progresii);
        buttonForProgresii.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,Progresii.class);
                startActivity(intent);
            }
        });

        Button buttonForTrigonometrie = (Button) findViewById(R.id.button_trigonometrii);
        buttonForTrigonometrie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,Trigonomeria.class);
                startActivity(intent);
            }
        });

        Button buttonForTablicaProiz = (Button) findViewById(R.id.button_tablica_proizvodnych);
        buttonForTablicaProiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,TablicaProizvodnych.class);
                startActivity(intent);
            }
        });

        Button buttonForLogarifms = (Button) findViewById(R.id.button_logarifms);
        buttonForLogarifms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,Logarifms.class);
                startActivity(intent);
            }
        });

        Button buttonForTheorieVer = (Button) findViewById(R.id.button_teorie);
        buttonForTheorieVer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormulasActivity.this,TheorieVer.class);
                startActivity(intent);
            }
        });



    }


    @Override
    public void finish() {
        getSupportActionBar();
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // animation for slide
    }


//    public void openPriznakidelimosti(View view) {
//        Intent intent = new Intent(this, Priznakidelimosti.class);
//        startActivity(intent);
//        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//    }




}

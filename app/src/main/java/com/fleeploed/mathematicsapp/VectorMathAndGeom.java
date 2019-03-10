package com.fleeploed.mathematicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class VectorMathAndGeom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_math_and_geom);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Векторная алгебра и аналитическая геометрия");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button buttonForVectornaya1 = (Button) findViewById(R.id.button_vektornaya1);
        buttonForVectornaya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, Alggeom1.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya2 = (Button) findViewById(R.id.button_vektornaya2);
        buttonForVectornaya2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom2.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya3 = (Button) findViewById(R.id.button_vektornaya3);
        buttonForVectornaya3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom3.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya4 = (Button) findViewById(R.id.button_vektornaya4);
        buttonForVectornaya4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom4.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya5 = (Button) findViewById(R.id.button_vektornaya5);
        buttonForVectornaya5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom5.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya6 = (Button) findViewById(R.id.button_vektornaya6);
        buttonForVectornaya6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom6.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya7 = (Button) findViewById(R.id.button_vektornaya7);
        buttonForVectornaya7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom7.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya8 = (Button) findViewById(R.id.button_vektornaya8);
        buttonForVectornaya8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom8.class);
                startActivity(intent);
            }
        });
        Button buttonForVectornaya9 = (Button) findViewById(R.id.button_vektornaya9);
        buttonForVectornaya9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom9.class);
                startActivity(intent);
            }
        });

        Button buttonForVectornaya10 = (Button) findViewById(R.id.button_vektornaya10);
        buttonForVectornaya10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VectorMathAndGeom.this, AlgGeom10.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = findViewById(R.id.calculator_VectorMathAndGeom);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VectorMathAndGeom.this, Calculator.class);
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


}

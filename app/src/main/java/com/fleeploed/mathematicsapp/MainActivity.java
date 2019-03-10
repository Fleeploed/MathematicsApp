package com.fleeploed.mathematicsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Высшая математика"); //название проекта в actionbar


        Button buttonForVector = (Button) findViewById(R.id.button_vectorMath_and_geom);
        buttonForVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VectorMathAndGeom.class);
                startActivity(intent);
            }
        });


        Button buttonForFormulas = (Button) findViewById(R.id.formulas);
        buttonForFormulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormulasActivity.class);
                startActivity(intent);
            }
        });

        MobileAds.initialize(this, "YOUR_ADMOB_APP_ID");

        FloatingActionButton fab = findViewById(R.id.calculator_mainActivity);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Приложение Высшая математика, скачивай от сюда - https://play.google.com/store/apps/details?id=com.fleeploed.mathematicsapp");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "Поделиться"));
                return true;

            case R.id.action_vk:
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/fleeploed"));
                startActivity(browserIntent);

        }


        return super.onOptionsItemSelected(item);
    }
}


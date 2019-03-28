package com.fleeploed.mathematicsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Predel11_15 extends AppCompatActivity {
    private AdView mAdView;
    PDFView pdfViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predel11_15);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Решения задач 11-15");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        MobileAds.initialize(this,
                "ca-app-pub-3860319943737586~1074237669");

        pdfViewer=(PDFView) findViewById(R.id.predel_dokazat_11_15);
        pdfViewer.fromAsset("predel/predel_dokazat_11_15.pdf").load();

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

}

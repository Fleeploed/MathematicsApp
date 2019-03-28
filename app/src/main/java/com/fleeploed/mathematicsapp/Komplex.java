package com.fleeploed.mathematicsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Komplex extends AppCompatActivity {
    private AdView mAdView;
    PDFView pdfViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komplex);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Комплексные числа");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //back formulasActivity


        MobileAds.initialize(this,
                "ca-app-pub-3860319943737586~1074237669");

        pdfViewer=(PDFView) findViewById(R.id.komplex);
        pdfViewer.fromAsset("formul/logarifms.pdf").load();

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

}

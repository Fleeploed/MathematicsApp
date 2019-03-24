package com.fleeploed.mathematicsapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class VectorMathAndGeom extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ShimmerTextView textView;
    Shimmer shimmer;

    ListView listView;
    String[] listviewitems = new String[]{"Решение задач 1", "Решение задач 2", "Решение задач 3",
            "Решение задач 4", "Решение задач 5", "Решение задач 6", "Решение задач 7", "Решение задач 8",
            "Решение задач 9", "Решение задач 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_math_and_geom);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("Векторная алгебра и аналитическая геометрия");



        listView = (ListView) findViewById(R.id.listview_vektor);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                listviewitems);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;

                String itemValue = (String) listView.getItemAtPosition(position);

                switch (itemPosition) {
                    case 0:
                        Intent appInfo = new Intent(VectorMathAndGeom.this, Alggeom1.class);
                        startActivity(appInfo);
                        break;
                    case 1:
                        Intent appInfo2 = new Intent(VectorMathAndGeom.this, AlgGeom2.class);
                        startActivity(appInfo2);
                        break;
                    case 2:
                        Intent appInfo3 = new Intent(VectorMathAndGeom.this, AlgGeom3.class);
                        startActivity(appInfo3);
                        break;
                    case 3:
                        Intent appInfo4 = new Intent(VectorMathAndGeom.this, AlgGeom4.class);
                        startActivity(appInfo4);
                        break;
                    case 4:
                        Intent appInfo5 = new Intent(VectorMathAndGeom.this, AlgGeom5.class);
                        startActivity(appInfo5);
                        break;
                    case 5:
                        Intent appInfo6 = new Intent(VectorMathAndGeom.this, AlgGeom6.class);
                        startActivity(appInfo6);
                        break;
                    case 6:
                        Intent appInfo7 = new Intent(VectorMathAndGeom.this, AlgGeom7.class);
                        startActivity(appInfo7);
                        break;
                    case 7:
                        Intent appInfo8 = new Intent(VectorMathAndGeom.this, AlgGeom8.class);
                        startActivity(appInfo8);
                        break;
                    case 8:
                        Intent appInfo9 = new Intent(VectorMathAndGeom.this, AlgGeom9.class);
                        startActivity(appInfo9);
                        break;
                    case 9:
                        Intent appInfo10 = new Intent(VectorMathAndGeom.this, AlgGeom10.class);
                        startActivity(appInfo10);
                        break;

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Приложение Высшая математика, скачивай" +
                        " от сюда - https://play.google.com/store/apps/details?id=com.fleeploed.mathematicsapp");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "Поделиться"));
                return true;

            case R.id.action_vk:
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/mathapp"));
                startActivity(browserIntent);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent i = new Intent(VectorMathAndGeom.this, MainActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_calculator) {
            Intent i = new Intent(VectorMathAndGeom.this, Calculator.class);
            startActivity(i);

        } else if (id == R.id.nav_wolfram) {
            Intent browserIntent = new
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wolframalpha.com/"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_mathway) {
            Intent browserIntent = new
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathway.com/ru/Calculus"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_info) {
            final Dialog d = new Dialog(VectorMathAndGeom.this);
            d.setTitle("О приложении");
            d.setContentView(R.layout.information_dialog);
            d.show();


            Button btnOk = d.findViewById(R.id.ok_button);

            btnOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    d.cancel();
                }
            });
        }

        textView = (ShimmerTextView) findViewById(R.id.shimmer_tv);

        shimmer = new Shimmer()
                .setDirection(Shimmer.ANIMATION_DIRECTION_LTR)
                .setDuration(1000)
                .setStartDelay(500);

        shimmer.start(textView);
        return true;

    }

    @Override
    public void finish() {
        getSupportActionBar();
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // animation for slide
    }
}

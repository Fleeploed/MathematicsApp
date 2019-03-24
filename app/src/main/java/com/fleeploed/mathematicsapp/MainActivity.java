package com.fleeploed.mathematicsapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ShimmerTextView textView;
    Shimmer shimmer;

    ListView listView;
    String[] listviewitems = new String[]{"Основные формулы", "Векторная алгебра и аналитическая геометрия"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setTitle("Высшая математика"); //название проекта в actionbar


        listView = (ListView) findViewById(R.id.listview_main);
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
                        Intent appInfo = new Intent(MainActivity.this, FormulasActivity.class);
                        startActivity(appInfo);
                        break;
                    case 1:
                        Intent appInfo2 = new Intent(MainActivity.this, VectorMathAndGeom.class);
                        startActivity(appInfo2);
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
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/fleeploed"));
                startActivity(browserIntent);

        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        Class fragmentClass = null;

        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {


        } else if (id == R.id.nav_calculator) {
            Intent i = new Intent(MainActivity.this, Calculator.class);
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

            final Dialog d = new Dialog(MainActivity.this);
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

}

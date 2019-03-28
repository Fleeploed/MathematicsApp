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
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandablelistView;

    // Assign Parent list items here.
    List<String> ParentList = new ArrayList<String>();

    {
        ParentList.add("Основные формулы");
        ParentList.add("Векторная алгебра и аналитическая геометрия");
        ParentList.add("Пределы - lim...(указать N(ε))");
        ParentList.add("Пределы - вычислить пределы числовых последовательностей");
    }

    // Assign children list element using string array.
    String[] formulas = {"Признаки делимости, таблица простых чисел", "Корни и степени, модуль числа",
            "Формула сокращенного умножения", "Прогресии", "Тригонометрия",
            "Пределы, таблица производных и интегралов", "Логарифмы", "Теория вероятности", "Комплексные числа"};
    String[] VectorAlg = {"Решения задач 1", "Решения задач 2", "Решения задач 3", "Решения задач 4",
            "Решения задач 5", "Решения задач 6", "Решения задач 7", "Решения задач 8", "Решения задач 9",
            "Решения задач 10"};

    String[] Predely = {"Решения задач 1-5", "Решения задач 6-10", "Решения задач 11-15",
            "Решения задач 16-20", "Решения задач 21-25", "Решения задач 26-30"};

    String[] Predely2 = {"Решения задач 1-9", "Решения задач 10-22", "Решения задач 23-31"};
//    String[] ByDefalutMessage = {"Items Loading"};

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

        ParentListItems = new LinkedHashMap<String, List<String>>();

        for (String HoldItem : ParentList) {
            if (HoldItem.equals("Основные формулы")) {
                loadChild(formulas);
            }
            else if (HoldItem.equals("Векторная алгебра и аналитическая геометрия")) {
                loadChild(VectorAlg);
            }
            else if (HoldItem.equals("Пределы - lim...(указать N(ε))")) {
                loadChild(Predely);
            }
            else if (HoldItem.equals("Пределы - вычислить пределы числовых последовательностей")) {
                loadChild(Predely2);
            }
            ParentListItems.put(HoldItem, ChildList);
        }

        expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
        final ExpandableListAdapter expListAdapter = new ListAdapter(
                this, ParentList, ParentListItems);
        expandablelistView.setAdapter(expListAdapter);

        expandablelistView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub

                final String selected = (String) expListAdapter.getChild(
                        groupPosition, childPosition);

                // Switch case to open selected child element activity on child element selection.
                Intent intent;
                switch (selected) {
                    case "Признаки делимости, таблица простых чисел":
                        intent = new Intent(MainActivity.this, Priznakidelimosti.class);
                        startActivity(intent);
                        break;
                    case "Корни и степени, модуль числа":
                        intent = new Intent(MainActivity.this, ModulFomulas.class);
                        startActivity(intent);
                        break;
                    case "Формула сокращенного умножения":
                        intent = new Intent(MainActivity.this, FormulSokr.class);
                        startActivity(intent);
                        break;
                    case "Прогресии":
                        intent = new Intent(MainActivity.this, Progresii.class);
                        startActivity(intent);
                        break;
                    case "Тригонометрия":
                        intent = new Intent(MainActivity.this, Trigonomeria.class);
                        startActivity(intent);
                        break;
                    case "Пределы, таблица производных и интегралов":
                        intent = new Intent(MainActivity.this, TablicaProizvodnych.class);
                        startActivity(intent);
                        break;
                    case "Логарифмы":
                        intent = new Intent(MainActivity.this, Logarifms.class);
                        startActivity(intent);
                        break;
                    case "Теория вероятности":
                        intent = new Intent(MainActivity.this, TheorieVer.class);
                        startActivity(intent);
                        break;
                    case "Комплексные числа":
                        intent = new Intent(MainActivity.this, Komplex.class);
                        startActivity(intent);
                        break;

                    /////////

                    case "Решения задач 1":
                        intent = new Intent(MainActivity.this, Alggeom1.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 2":
                        intent = new Intent(MainActivity.this, AlgGeom2.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 3":
                        intent = new Intent(MainActivity.this, AlgGeom3.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 4":
                        intent = new Intent(MainActivity.this, AlgGeom4.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 5":
                        intent = new Intent(MainActivity.this, AlgGeom5.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 6":
                        intent = new Intent(MainActivity.this, AlgGeom6.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 7":
                        intent = new Intent(MainActivity.this, AlgGeom7.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 8":
                        intent = new Intent(MainActivity.this, AlgGeom8.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 9":
                        intent = new Intent(MainActivity.this, AlgGeom9.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 10":
                        intent = new Intent(MainActivity.this, AlgGeom10.class);
                        startActivity(intent);
                        break;

                    /////////

                    case "Решения задач 1-5":
                        intent = new Intent(MainActivity.this, Predel1_5.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 6-10":
                        intent = new Intent(MainActivity.this, Predel6_10.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 11-15":
                        intent = new Intent(MainActivity.this, Predel11_15.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 16-20":
                        intent = new Intent(MainActivity.this, Predel16_20.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 21-25":
                        intent = new Intent(MainActivity.this, Predel21_25.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 26-30":
                        intent = new Intent(MainActivity.this, Predel26_30.class);
                        startActivity(intent);
                        break;

                    /////////

                    case "Решения задач 1-9":
                        intent = new Intent(MainActivity.this, Predel2_1_9.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 10-22":
                        intent = new Intent(MainActivity.this, Predel2_10_22.class);
                        startActivity(intent);
                        break;
                    case "Решения задач 23-31":
                        intent = new Intent(MainActivity.this, Predel2_23_31.class);
                        startActivity(intent);
                        break;
                }

                return true;
            }
        });

    }

    private void loadChild(String[] ParentElementsName) {
        ChildList = new ArrayList<String>();
        for (String model : ParentElementsName)
            ChildList.add(model);
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


        if (id == R.id.nav_calculator) {
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

        return true;
    }

}

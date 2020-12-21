package com.example.Assignment3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class NavDrawer extends AppCompatActivity {

    private DrawerLayout D1Main;
    private NavigationView NavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer);

        D1Main=findViewById(R.id.main_drawer);
        NavView=findViewById(R.id.nav_view);


        NavView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id=menuItem.getItemId();
                switch (id){
                    case R.id.quiz:
                        Intent i = new Intent(NavDrawer.this, MainActivity.class);
                        startActivity(i);
                        return true;
                    case R.id.calculator:
                        Log.d("Ramis","Pakistan");
                        Intent j = new Intent(NavDrawer.this, calculator.class);

                        startActivity(j);
                    default:
                        return true;




                }

            }
        });
    }
}
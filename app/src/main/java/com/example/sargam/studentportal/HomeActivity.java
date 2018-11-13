package com.example.sargam.studentportal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        NavigationView navView=findViewById(R.id.nav_menu);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.profile:
                    {
                        Intent i=new Intent(HomeActivity.this,ProfileActivity.class);
                        startActivity(i);
                        break;
                    }
                    case R.id.search:
                    {
                        Intent i=new Intent(HomeActivity.this,SearchActivity.class);
                        startActivity(i);
                        break;
                    }
                    case R.id.report:
                    {
                        Intent i=new Intent(HomeActivity.this,ReportActivity.class);
                        startActivity(i);
                        break;
                    }
                    case R.id.reviews:
                    {
                        Intent i=new Intent(HomeActivity.this,ReviewActivity.class);
                        startActivity(i);
                        break;
                    }
                    case R.id.logout:
                    {
                        Intent i=new Intent(HomeActivity.this,MainActivity.class);
                        startActivity(i);
                        break;
                    }
                }
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);

                return true;
            }
        });
    }
}

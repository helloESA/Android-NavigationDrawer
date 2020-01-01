package com.meproduction.noteblocreplicarev1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    String[] menuItem = {"Dokumen Tugas",
            "Dokumen Latihan",
            "Dokumen 10"};
    String[] menuCreate = {"Dibuat : 2019-11-11. 16:20",
            "Dibuat : 2019-12-11. 15:10",
            "Dibuat : 2019-12-20. 16:00"};
    String[] menuPage = {"10 Halaman, 2,3 MB",
            "5 Halaman, 1,8 MB",
            "1 Halaman, 500 kB"};
    Integer[] menuImage ={
            R.drawable.ic_image_black_24dp,
            R.drawable.ic_image_black_24dp,
            R.drawable.ic_image_black_24dp,};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        findViewById(R.id.ImageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.Nav_view);
        navigationView.setItemIconTintList(null);

        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}

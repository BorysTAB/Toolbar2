package com.example.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intencja_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intencja2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_glowne, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            Intent intent = new Intent(this, Intencja_1.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.menu2) {
            Intent intent2 = new Intent(this, Intencja_2.class);
            startActivity(intent2);
            return true;
        } else if (item.getItemId() == R.id.menu3) {
            Intent intent3 = new Intent(this, Intencja_3.class);
            startActivity(intent3);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hello from mahi's app", Toast.LENGTH_SHORT).show();

        toolbar=findViewById(R.id.tb);
        setSupportActionBar(toolbar);

    }

    public void clickMe(View view) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.home_menu,menu);
        return true;
    }
}
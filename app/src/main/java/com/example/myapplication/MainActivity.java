package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void Societies(View view)
    {
        Intent intent=new Intent( this, Societies.class);
        startActivity(intent);
    }

    public void Events(View view)
    {
        Intent intent=new Intent( this, Events.class);
        startActivity(intent);
    }

    public void Settings(View view)
    {
        Intent intent=new Intent( this, Settings.class);
        startActivity(intent);
    }
}

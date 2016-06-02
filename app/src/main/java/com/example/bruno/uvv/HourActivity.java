package com.example.bruno.uvv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class HourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hour_screen);

        Toolbar myChildToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolBar);

        ActionBar ab = getSupportActionBar();
    }
}

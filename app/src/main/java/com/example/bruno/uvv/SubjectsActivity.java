package com.example.bruno.uvv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SubjectsActivity extends AppCompatActivity {

    String[] courses = {
            "Interação Homem/Máquina",
            "Eng. de Software II",
            "Teoria da Computação",
            "Programação OO",
            "Qualidade e Teste de Software"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.subjects_screen);

        Toolbar myChildToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolBar);

        ActionBar ab = getSupportActionBar();

        ArrayList<String> act = new ArrayList<String>(Arrays.asList(courses));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.subject_list_item, R.id.subject_list_item_text_view, act);
        ListView list = (ListView) findViewById(R.id.subject_list_view);
        list.setAdapter(adapter);
    }
}

package com.example.bruno.uvv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageActivity extends AppCompatActivity {

    String[] messages = {
            "Oportunidade de estágio AVDEC",
            "Maratona de programação",
            "Monitoria de engenharia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.messages_screen);

        Toolbar myChildToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolBar);

        ActionBar ab = getSupportActionBar();

        ArrayList<String> act = new ArrayList<String>(Arrays.asList(messages));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.message_list_view, R.id.message_list_text_view, act);
        ListView list = (ListView) findViewById(R.id.message_list_view);

        list.setAdapter(adapter);
    }
}

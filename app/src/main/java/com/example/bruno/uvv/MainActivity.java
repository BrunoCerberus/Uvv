package com.example.bruno.uvv;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Boolean log = false;
    String[] atividades = {
            "Um novo boleto foi adicionado ao seu sistema",
            "UVV recebe novo evento",
            "Boletin atualizado",
            "Hudson atravessa um arco-íris e é encontrado no Japão",
            "bla bla bla bla",
            "Era um vez",
            "ddassdadas",
            "sadasdadassdda",
            "dasdadasddsadasasdsadsas",
            "dasdadasddsadasasdaddsasdasd",
            "dasdadasddsadasasadsdadasdsasd",
            "dasdadasddsadasasdadasdsadsasdsasa",
            "dasdadasddsadasasdsadasdsdsaddsadsadsadas",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        Toolbar myToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolBar);
    }


    public void login(View view) {

        EditText login = (EditText) findViewById(R.id.input_login);
        EditText password = (EditText) findViewById(R.id.input_password);

        if(login.getText().toString().trim().length() == 0 || password.getText().toString().trim().length() == 0){
            Toast.makeText(MainActivity.this, "Complete os campos Matrícula e Senha!", Toast.LENGTH_SHORT).show();
            return;
        }

        if(!(login.getText().toString().equals("201671018")) || !(password.getText().toString().equals("123"))){
            Toast.makeText(MainActivity.this, "Matrícula ou Senha incorretos!", Toast.LENGTH_SHORT).show();
            return;
        }

        log = true;

        setContentView(R.layout.functions_screen);
        Toast.makeText(MainActivity.this, "Logado com sucesso!", Toast.LENGTH_SHORT).show();

        ArrayList<String> act = new ArrayList<>(Arrays.asList(atividades));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, R.id.list_view_text_view, act);
        ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(adapter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        if(log == true) {
            setContentView(R.layout.functions_screen);


            ArrayList<String> act = new ArrayList<>(Arrays.asList(atividades));
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, R.id.list_view_text_view, act);
            ListView list = (ListView) findViewById(R.id.list_view);
            list.setAdapter(adapter);

        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (log == true) {
            setContentView(R.layout.functions_screen);


            ArrayList<String> act = new ArrayList<>(Arrays.asList(atividades));
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, R.id.list_view_text_view, act);
            ListView list = (ListView) findViewById(R.id.list_view);
            list.setAdapter(adapter);
        }
    }

    @Override
    public void onBackPressed() {
        if(log == true){
            setContentView(R.layout.functions_screen);

            ArrayList<String> act = new ArrayList<>(Arrays.asList(atividades));
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, R.id.list_view_text_view, act);
            ListView list = (ListView) findViewById(R.id.list_view);
            list.setAdapter(adapter);
        } else {
            return;
        }
    }

    public void information(View view) {
        Intent i = new Intent(this, MyChildActivity.class);
        startActivity(i);
    }

    public void messages (View view) {
        Intent i = new Intent(this, MessageActivity.class);
        startActivity(i);
    }

    public void subjects (View view) {
        Intent i = new Intent(this, SubjectsActivity.class);
        startActivity(i);
    }

    public void hour (View view) {
        Intent i = new Intent(this, HourActivity.class);
        startActivity(i);
    }

    public void events (View view) {
        Intent i = new Intent(this, EventsActivity.class);
        startActivity(i);
    }

    public void financial (View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Em breve!");
        alert.setCancelable(true);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alert.show();
    }

}

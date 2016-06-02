package com.example.bruno.uvv;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by bruno on 01/06/2016.
 */
public class MyChildActivity extends AppCompatActivity {

    String name = "";
    String date = "";
    String sex = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_screen);

        Toolbar myChildToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolBar);

        ActionBar ab = getSupportActionBar();

        EditText inputName = (EditText) findViewById(R.id.input_name);
        EditText inputDate = (EditText) findViewById(R.id.input_date);
        RadioButton male = (RadioButton) findViewById(R.id.male_radio);
        RadioButton female = (RadioButton) findViewById(R.id.female_radio);

        inputName.setText(name);
        inputDate.setText(date);

        if (sex.equals("M"))
            male.isChecked();

        if (sex.equals("F"))
            female.isChecked();

    }

    public void save (View view) {
        EditText inputName = (EditText) findViewById(R.id.input_name);
        EditText inputDate = (EditText) findViewById(R.id.input_date);
        RadioButton male = (RadioButton) findViewById(R.id.male_radio);
        RadioButton female = (RadioButton) findViewById(R.id.female_radio);

        name = inputName.getText().toString();
        date = inputDate.getText().toString();

        if (male.isChecked()) {
            sex = "M";
        }

        if (female.isChecked()) {
            sex = "F";
        }

        finish();
        Toast.makeText(MyChildActivity.this, "Dados salvos!", Toast.LENGTH_SHORT).show();
    }
}

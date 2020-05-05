package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Week3Challenge2Activity extends AppCompatActivity {

    private Spinner spinner;
    private List<String> desert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_week3_challenge2);
        setContentView(R.layout.week3_challenge2_3spinner);

        spinner = findViewById(R.id.spinnerdesert);
        setSpinnerSource();
        spinner.setAdapter(getSpinnerAdapter());
    }

    private void setSpinnerSource() {
        desert = new ArrayList<>();
        desert.add("Cupcake");
        desert.add("Donut");
        desert.add("Eclair");
        desert.add("KitKat");
        desert.add("Pie");
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, desert);
    }
}

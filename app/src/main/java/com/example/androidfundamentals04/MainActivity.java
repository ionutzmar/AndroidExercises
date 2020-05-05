package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //    private static final String FB_URL = "https://ing.ro/";
//    private WebView webView;
    private Spinner spinner;
    private List<String> fructe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        setContentView(R.layout.webview_sample);
//        webView = findViewById(R.id.webViewAndroid);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl(FB_URL);
        setContentView(R.layout.spinner_sample);
        spinner = findViewById(R.id.spinnerFructe);
        setSpinnerSource();
        spinner.setAdapter(getSpinnerAdapter());

    }

    private void setSpinnerSource() {
        fructe = new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Para");
        fructe.add("Gutuie");
        fructe.add("Mango");
        fructe.add("Cirese");
        fructe.add("Rodie");
        fructe.add("Rosie");
        fructe.add("Zmeura");
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fructe);
    }
}

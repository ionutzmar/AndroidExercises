package com.example.androidfundamentals04.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.androidfundamentals04.R;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String messageFromActivity = bundle.getString(SecondActivity.ECHO);
            if (messageFromActivity != null && messageFromActivity.length() >= 3) {
                String response = "Yes, yes, I am right here!";
                Intent intent = new Intent();
                intent.putExtra(SecondActivity.RESPONSE, response);
                setResult(RESULT_OK, intent);
                finish();
            }
        }
    }
}

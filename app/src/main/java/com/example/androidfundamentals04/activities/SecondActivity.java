package com.example.androidfundamentals04.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidfundamentals04.R;

public class SecondActivity extends AppCompatActivity {

    public static final String ECHO = "echo";
    public static final String RESPONSE = "response";
    public static final int ECHO_CHANNEL = 346;

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextMessage = findViewById(R.id.editText);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(LifecycleTestActivity.MESSAGE);
            int count = bundle.getInt(LifecycleTestActivity.COUNT);
            Toast.makeText(SecondActivity.this, message, Toast.LENGTH_LONG).show();
        }
    }

    public void sendMessageToActivityOnClick(View view) {
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        intent.putExtra(ECHO, "Are you there?");
        startActivityForResult(intent, ECHO_CHANNEL);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ECHO_CHANNEL && resultCode == RESULT_OK) {
            String resultFromThirdActivity = data.getStringExtra(RESPONSE);
            editTextMessage.setText(resultFromThirdActivity);
        }
    }
}

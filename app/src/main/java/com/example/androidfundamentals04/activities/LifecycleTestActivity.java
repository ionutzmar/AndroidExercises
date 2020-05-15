package com.example.androidfundamentals04.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.androidfundamentals04.R;

public class LifecycleTestActivity extends AppCompatActivity {

    public static String MESSAGE = "message";
    public static String COUNT = "count";

    private static String TAG = "LifecycleTestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle_test);
        Log.e(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void openSecondActivityOnClick(View view) {
        Intent intent = new Intent(LifecycleTestActivity.this, SecondActivity.class);
        intent.putExtra(MESSAGE, "Hello second activity");
        intent.putExtra(COUNT, 23);
        startActivity(intent);

    }

    public void callOnClick(View view) {
        Intent callImplicitIntent = new Intent(Intent.ACTION_DIAL);
        callImplicitIntent.setData(Uri.parse("tel:0701234567"));
        if (callImplicitIntent.resolveActivity((getPackageManager())) != null)
            startActivity(callImplicitIntent);
    }

    public void openLinkOnClick(View view) {
        Intent openUrlImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openUrlImplicitIntent.setData(Uri.parse("https://www.youtube.com/watch?v=_n1MIh1DZm8"));
        startActivity(openUrlImplicitIntent);
    }
}

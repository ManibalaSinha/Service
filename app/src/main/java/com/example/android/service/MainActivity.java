package com.example.android.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String msg = "Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"the onCreate() event");
    }
    public void startService(View view){
        startService(new Intent(getBaseContext(), MyService.class));
    }

    //method to stop
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}

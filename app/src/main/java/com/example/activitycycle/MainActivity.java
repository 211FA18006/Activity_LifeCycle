package com.example.activitycycle;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart: ");
        System.out.println("Im starting the application.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on Resume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume: ");
        System.out.println("Im Resuming the Application.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause: ");
        System.out.println("Im Pausing the Application.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on Stop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop: ");
        System.out.println("Im stopping the Application.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on Destroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy: ");
        System.out.println("Im Destroying the Application");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart: ");
        System.out.println("Im Restarting the Application.");
    }


}
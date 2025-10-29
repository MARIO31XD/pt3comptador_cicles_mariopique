package com.example.pt3_ciclesvida_mariopique;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;

import android.widget.TextView;
import android.util.Log;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    // Comptadors i de cada cicle de vida
    private int createCount;
    private int startCount;
    private int restartCount;
    private int resumeCount;
    private int pauseCount;
    private int stopCount;
    private int destroyCount;

    private TextView txtOnStop,txtOnCreate, txtOnPause, txtOnDestroy, txtOnResume, txtOnRestart, txtOnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular TextViews
        txtOnCreate = findViewById(R.id.txtOnCreate);
        txtOnStart = findViewById(R.id.txtOnStart);
        txtOnRestart = findViewById(R.id.txtOnRestart);
        txtOnResume = findViewById(R.id.txtOnResume);
        txtOnPause = findViewById(R.id.txtOnPause);
        txtOnStop = findViewById(R.id.txtOnStop);
        txtOnDestroy = findViewById(R.id.txtOnDestroy);

    }


    @Override
    protected void onStart() {
        super.onStart();
        startCount++;
        updateCounters();
        Log.d("Cicle de vida", "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restartCount++;
        updateCounters();
        Log.d("Cicle de vida", "onRestart()");
    }

    @Override
    protected void onResume() {

        super.onResume();
        resumeCount++;
        updateCounters();
        Log.d("Cicle de vida", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        pauseCount++;
        updateCounters();
        Log.d("Cicle de vida", "onPause()");
    }

    @Override
    protected void onStop() {

        super.onStop();
        stopCount++;
        updateCounters();
        Log.d("Cicle de vida", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroyCount++;
        updateCounters();
        Log.d("Cicle de vida", "onDestroy()");
    }

    private void updateCounters() {

        txtOnCreate.setText("onCreate() → s’ha executat " + createCount + " cops");
        txtOnStart.setText("onStart() → s’ha executat " + startCount + " cops");
        txtOnRestart.setText("onRestart() → s’ha executat " + restartCount + " cops");
        txtOnResume.setText("onResume() → s’ha executat " + resumeCount + " cops");
        txtOnPause.setText("onPause() → s’ha executat " + pauseCount + " cops");
        txtOnStop.setText("onStop() → s’ha executat " + stopCount + " cops");
        txtOnDestroy.setText("onDestroy() → s’ha executat " + destroyCount + " cops");


    }
}




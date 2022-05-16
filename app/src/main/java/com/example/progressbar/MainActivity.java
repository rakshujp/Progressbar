package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pgsBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view){
        pgsBar = (ProgressBar) findViewById(R.id.progressBar2);
        int i = pgsBar.getProgress();
        pgsBar.setProgress(i+10);
    }

    public void reset(View view){
        pgsBar = (ProgressBar) findViewById(R.id.progressBar2);
        int i = pgsBar.getProgress();
        pgsBar.setProgress(0);
    }
}
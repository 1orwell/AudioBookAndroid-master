package com.example.ashish.audiobookfortablet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by leesie on 24/07/17.
 */

public class TomBeforeWaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tom_before_wave);
    }

    /** Called when the user clicks the Begin button */
    public void nextPage(View v2) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "<" button */
    public void prevPage(View v2) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}

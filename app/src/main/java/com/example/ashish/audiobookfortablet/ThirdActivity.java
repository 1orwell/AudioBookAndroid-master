package com.example.ashish.audiobookfortablet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by leesie on 03/07/17.
 */

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    /** Called when the user clicks the Begin button */
    public void nextPage(View v2) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "<" button */
    public void prevPage(View v2) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

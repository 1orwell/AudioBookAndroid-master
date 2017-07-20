package com.example.ashish.audiobookfortablet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.content.Context;

/**
 * Created by JohnB on 02/03/2017.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /** Called when the user clicks the ">" button
    public void nextPage(View v2) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

     */

    /** Called when the user clicks the Begin button */
    public void nextPage(View v2) {
        Intent intent = new Intent(this, SpinAnimation.class);
        startActivity(intent);
    }
}

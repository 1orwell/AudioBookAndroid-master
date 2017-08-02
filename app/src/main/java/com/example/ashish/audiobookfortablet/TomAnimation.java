package com.example.ashish.audiobookfortablet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;
import android.view.MotionEvent;


/**
 * Created by leesie on 05/07/17.
 */

public class TomAnimation extends Activity {

    AnimationDrawable tom_anim;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tom_anim);

        //Beginning the loading animation as we attempt to verify registration with SIP
        ImageView ivLoader = (ImageView) findViewById(R.id.imageView2);
        ivLoader.setBackgroundResource(R.drawable.tom_animation);

        tom_anim = (AnimationDrawable) ivLoader.getBackground();

    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            tom_anim.start();
            return true;
        }
        return super.onTouchEvent(event);
    }

    public void nextPage(View v2) {
        Intent intent = new Intent(this, JackAnimation.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "<" button */
    public void prevPage(View v2) {
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }
}

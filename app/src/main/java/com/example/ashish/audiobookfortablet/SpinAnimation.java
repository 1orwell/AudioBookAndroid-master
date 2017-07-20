package com.example.ashish.audiobookfortablet;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;
import android.view.MotionEvent;


/**
 * Created by leesie on 05/07/17.
 */

public class SpinAnimation extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        //Beginning the loading animation as we attempt to verify registration with SIP
        ImageView ivLoader = (ImageView) findViewById(R.id.IVloadinganimation);
        ivLoader.setBackgroundResource(R.anim.animationloader);


        AnimationDrawable frameAnimation = (AnimationDrawable) ivLoader.getBackground();
        frameAnimation.start();
    }

    public void nextPage(View v2) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "<" button */
    public void prevPage(View v2) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

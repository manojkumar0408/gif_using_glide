package com.iwave.gifusingglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mImageView =(ImageView) findViewById(R.id.GifImageView);

        Glide.with(MainActivity.this)
                .load(R.drawable.gifof)
                .asGif()//its a imageview we r specifying it as gif
                .placeholder(R.drawable.gifof)//given this beacuse
                //of bad internet connection
                .into(mImageView);
    }
}

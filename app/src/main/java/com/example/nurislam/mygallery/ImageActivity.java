package com.example.nurislam.mygallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Nurislam on 06.10.2016.
 */

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ImageView imageView = (ImageView) findViewById(R.id.iv_image);
        int res = getIntent().getIntExtra("image", R.drawable.img_1);
        imageView.setImageResource(res);
    }
}

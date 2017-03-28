package com.example.minchaozhu.jstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by minchao.zhu on 2017/3/28.
 */

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mImageView;
    private static final String TAG = ImageViewActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        initUI();
    }

    private void initUI(){
        String img = getIntent().getStringExtra("img");
        if(img == null || img.length() == 0){
            Log.d(TAG,"img is null");
        }else{
            Log.d(TAG,"img: " + img);
        }
        mImageView = (ImageView) findViewById(R.id.layout_content);
        Glide.with(this).load(img).into(mImageView);
    }
}

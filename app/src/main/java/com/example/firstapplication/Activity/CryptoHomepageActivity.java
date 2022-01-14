package com.example.firstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.firstapplication.Adapter.MpagerAdapter;
import com.example.firstapplication.R;

public class CryptoHomepageActivity extends AppCompatActivity {
    private ViewPager mPager;
    private int layouts[] = {
            R.layout.crpyto_firstslide,R.layout.crypto_secondslide,
            R.layout.crypto_thirdslide};
    private MpagerAdapter mpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_homepage);

        mPager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdapter = new MpagerAdapter(layouts, this);
        mPager.setAdapter(mpagerAdapter);
    }
}
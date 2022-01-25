package com.example.firstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.firstapplication.Adapter.MpagerAdapter;
import com.example.firstapplication.R;

public class CryptoHomepageActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager mPager;
    private int layouts[] = {
            R.layout.crpyto_firstslide,R.layout.crypto_secondslide,
            R.layout.crypto_thirdslide};
    private MpagerAdapter mpagerAdapter;

    //sliding dots
    private LinearLayout layoutDots;
    private ImageView dots[];

    //buttons
    private Button btnNext, btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_homepage);

        mPager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdapter = new MpagerAdapter(layouts, this);
        mPager.setAdapter(mpagerAdapter);

        layoutDots = (LinearLayout) findViewById(R.id.dotsLayout);
        createDots(0);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnSkip = (Button) findViewById(R.id.btnSkip);

        btnNext.setOnClickListener(this);
        btnSkip.setOnClickListener(this);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                createDots(position);
                if (position == layouts.length -1 ) {
                    btnNext.setText(R.string.start);
                    btnSkip.setVisibility(View.INVISIBLE);
                }
                else {
                    btnNext.setText(R.string.next);
                    btnSkip.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void createDots(int current_position) {
        if (layoutDots != null) {
            layoutDots.removeAllViews();
        }
        dots = new ImageView[layouts.length];

        for (int i = 0; i < layouts.length; i++) {
            dots[i] = new ImageView(this);
            if (i == current_position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.active_dots));
            }
            else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.default_dots));
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(4,0,4,0);

            layoutDots.addView(dots[i],params);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNext:
                loadNextSlide();
                break;

            case R.id.btnSkip:
                loadHome();
                break;
        }
    }

    private void loadHome() {
        startActivity(new Intent(this, SecondSlideActivity.class));
        finish();
    }

    private void loadNextSlide() {
        int nextSlide = mPager.getCurrentItem() + 1;

        if (nextSlide < layouts.length) {
            mPager.setCurrentItem(nextSlide);
        }
        else {
            loadHome();
        }
    }
}
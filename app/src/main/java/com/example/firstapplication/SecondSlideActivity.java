package com.example.firstapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapplication.Adapter.SecondSlideAdapter;

import java.util.ArrayList;

public class SecondSlideActivity extends AppCompatActivity {
    ArrayList<CryptoImages> cryptoImageViews;
    ArrayList<String> cryptoNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_slide);

    RecyclerView cryptoRecycler = findViewById(R.id.rvfirstviews);
        int crypto_images[] = {
            R.drawable.bitcoin_logo,
            R.drawable.dodgecoin,
            R.drawable.chainlink,
        };
        cryptoNames.add("Bitcoin");
        cryptoNames.add("Dodge coin");
        cryptoNames.add("Chain link");


        cryptoImageViews = CryptoImages.createCryptoImages(crypto_images);
        SecondSlideAdapter firstSection = new SecondSlideAdapter(cryptoImageViews,cryptoNames);
        cryptoRecycler.setAdapter(firstSection);
        LinearLayoutManager horizontalLayoutManager1 = new LinearLayoutManager(SecondSlideActivity.this,
                LinearLayoutManager.HORIZONTAL, false);


    }
}

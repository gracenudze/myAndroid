package com.example.firstapplication.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapplication.Adapter.SecondSlideAdapterOne;
import com.example.firstapplication.Adapter.SecondSlideAdapterTwo;
import com.example.firstapplication.FirstCryptoList;
import com.example.firstapplication.R;
import com.example.firstapplication.SecondCryptoList;

import java.util.ArrayList;

public class SecondSlideActivity extends AppCompatActivity {
    ArrayList<FirstCryptoList> firstCryptoList = new ArrayList<>();
    ArrayList<SecondCryptoList> secondCryptoList = new ArrayList<>();

    int crypto_images[] = {
            R.drawable.bitcoin_logo,
            R.drawable.dodgecoin,
            R.drawable.chainlink,
    };
    String cryptoNames[] = {
            "Bitcoin",
            "Dodge coin",
            "Chain link"
    };
    int crypto_logos[] = {
            R.drawable.etherium_logo,
            R.drawable.binance_logo,
            R.drawable.xrp_logo,
            R.drawable.litecoin_logo,
            R.drawable.cardano_logo
    };
    String crypto_names[] = {
            "Eutherium",
            "Binance",
            "XRP",
            "Litecoin",
            "Cardano"
    };
    String crypto_earnings[] = {
            "$4,549.5",
            "$5,678.9",
            "$8,930.6",
            "$9,421.7",
            "$6,211.1"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crypto_listings);

        createFirstCryptoList();
        createSecondCryptoList();

    RecyclerView cryptoRecycler = findViewById(R.id.rvFirstView);
    cryptoRecycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,
            false));
        SecondSlideAdapterOne firstSection = new SecondSlideAdapterOne(firstCryptoList);
        cryptoRecycler.setAdapter(firstSection);

        RecyclerView secondCryptoRecycler = findViewById(R.id.rvSecondView);
        secondCryptoRecycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,
                false));
        SecondSlideAdapterTwo secondSection = new SecondSlideAdapterTwo(secondCryptoList);
        secondCryptoRecycler.setAdapter(secondSection);
    }
    private void createFirstCryptoList() {
        int count = 0;
        for (String names: cryptoNames) {
            FirstCryptoList firstCryptoList = new FirstCryptoList(crypto_images[count], names);
            this.firstCryptoList.add(firstCryptoList);
            count++;
        }
    }
    private void createSecondCryptoList() {
        int count = 0;
        for (String names: crypto_names) {
            SecondCryptoList secondCryptoList = new SecondCryptoList(crypto_logos[count],names,
                    crypto_earnings[count]);
            this.secondCryptoList.add(secondCryptoList);
            count++;
        }
    }
}

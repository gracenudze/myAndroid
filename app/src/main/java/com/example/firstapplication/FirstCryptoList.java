package com.example.firstapplication;

import java.util.ArrayList;

public class FirstCryptoList {
    private int mCryptoImages;
    private String mCryptoNames;
    private String mCryptoHoldings;
    private String mCryptoPercent;

    public FirstCryptoList(int imageViews, String cryptoNames, String cryptoHoldings,
                           String cryptoPercent) {
        this.mCryptoImages = imageViews;
        this.mCryptoNames = cryptoNames;
        this.mCryptoHoldings = cryptoHoldings;
        this.mCryptoPercent = cryptoPercent;

    }

    public int getCryptoImages() {
        return mCryptoImages;
    }

    public String getCryptoNames() {
        return mCryptoNames;
    }

    public String getCryptoHoldings() {
        return mCryptoHoldings;
    }

    public String getCryptoPercent() {
        return mCryptoPercent;
    }
}

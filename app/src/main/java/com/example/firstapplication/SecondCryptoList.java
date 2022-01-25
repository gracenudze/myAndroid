package com.example.firstapplication;

public class SecondCryptoList {
    private int mBitcoinLogos;
    private String mBitcoinNames;
    private String mBitcoinEarnings;

    public SecondCryptoList(int bitcoin_logos, String bitcoin_names, String bitcoin_earnings) {
        this.mBitcoinLogos = bitcoin_logos;
        this.mBitcoinNames = bitcoin_names;
        this.mBitcoinEarnings = bitcoin_earnings;
    }

    public int getBitcoinLogos() {
        return mBitcoinLogos;
    }

    public String getBitcoinNames() {
        return mBitcoinNames;
    }

    public String getBitcoinEarnings() {
        return mBitcoinEarnings;
    }
}

package com.example.firstapplication;

public class SecondCryptoList {
    private int mBitcoinLogos;
    private String mBitcoinNames;
    private String mBitcoinEarnings;
    private String mCurrencyExchange;
    private String mTempHoldings;

    public SecondCryptoList(int bitcoin_logos, String bitcoin_names, String bitcoin_earnings,
                            String currency_exchange, String tempHoldings) {
        this.mBitcoinLogos = bitcoin_logos;
        this.mBitcoinNames = bitcoin_names;
        this.mBitcoinEarnings = bitcoin_earnings;
        this.mCurrencyExchange = currency_exchange;
        this.mTempHoldings = tempHoldings;

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

    public String getCurrencyExchange() {
        return mCurrencyExchange;
    }

    public String getTempHoldings() {
        return mTempHoldings;
    }
}

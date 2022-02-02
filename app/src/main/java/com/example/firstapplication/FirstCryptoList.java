package com.example.firstapplication;

import java.util.ArrayList;

public class FirstCryptoList {
    private int mCryptoImages;
    private String mCryptoNames;
<<<<<<< HEAD
    private String mCryptoHoldings;
    private String mCryptoPercent;

    public FirstCryptoList(int imageViews, String cryptoNames, String cryptoHoldings,
                           String cryptoPercent) {
        this.mCryptoImages = imageViews;
        this.mCryptoNames = cryptoNames;
        this.mCryptoHoldings = cryptoHoldings;
        this.mCryptoPercent = cryptoPercent;
=======

    public FirstCryptoList(int imageViews, String cryptoNames) {
        this.mCryptoImages = imageViews;
        this.mCryptoNames = cryptoNames;
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
    }

    public int getCryptoImages() {
        return mCryptoImages;
    }

    public String getCryptoNames() {
        return mCryptoNames;
    }
<<<<<<< HEAD

    public String getCryptoHoldings() {
        return mCryptoHoldings;
    }

    public String getCryptoPercent() {
        return mCryptoPercent;
    }
=======
//    public static ArrayList<CryptoList> createCryptoImages(int[] cryptoPictures) {
//        ArrayList<CryptoList> cryptoImages = new ArrayList<>();
//        int imageNum = cryptoPictures.length;
//
//        for (int i = 0; i < imageNum; i++) {
//            cryptoImages.add(new CryptoList(cryptoPictures[i]));
//        }
//        return cryptoImages;
//    }

>>>>>>> 6dd54416544f737123158010298a86a385aed31d

}

package com.example.firstapplication;

import java.util.ArrayList;

public class FirstCryptoList {
    private int mCryptoImages;
    private String mCryptoNames;

    public FirstCryptoList(int imageViews, String cryptoNames) {
        this.mCryptoImages = imageViews;
        this.mCryptoNames = cryptoNames;
    }

    public int getCryptoImages() {
        return mCryptoImages;
    }

    public String getCryptoNames() {
        return mCryptoNames;
    }
//    public static ArrayList<CryptoList> createCryptoImages(int[] cryptoPictures) {
//        ArrayList<CryptoList> cryptoImages = new ArrayList<>();
//        int imageNum = cryptoPictures.length;
//
//        for (int i = 0; i < imageNum; i++) {
//            cryptoImages.add(new CryptoList(cryptoPictures[i]));
//        }
//        return cryptoImages;
//    }


}

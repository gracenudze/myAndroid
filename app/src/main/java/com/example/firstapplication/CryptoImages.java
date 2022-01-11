package com.example.firstapplication;

import java.util.ArrayList;

public class CryptoImages {
    private int mCryptoImages;

    public CryptoImages(int imageViews) {
        this.mCryptoImages = imageViews;
    }
    public int getCryptoImages() {
        return mCryptoImages;
    }
    public static ArrayList<CryptoImages> createCryptoImages(int[] cryptoPictures) {
        ArrayList<CryptoImages> cryptoImages = new ArrayList<>();
        int imageNum = cryptoPictures.length;

        for (int i = 0; i < imageNum; i++) {
            cryptoImages.add(new CryptoImages(cryptoPictures[i]));
        }
        return cryptoImages;
    }
}

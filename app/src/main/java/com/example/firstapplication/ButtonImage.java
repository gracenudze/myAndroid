package com.example.firstapplication;

import java.util.ArrayList;

public class ButtonImage {
    private int mButtonImage;

    public ButtonImage(int buttonImage) {
        this.mButtonImage = buttonImage;
    }

    public int getButtonImage() {
        return mButtonImage;
    }

    public static ArrayList<ButtonImage> createButtonImageList(int[] pictureImages) {
        ArrayList<ButtonImage> buttonImages = new ArrayList<>();
        int buttonNum = pictureImages.length;

        for (int i = 0; i < buttonNum; i++) {
            buttonImages.add(new ButtonImage(pictureImages[i]));
        }
        return buttonImages;
    }


}



package com.example.firstapplication;

import java.util.ArrayList;

public class ButtonNames{
    private String mName;

    public ButtonNames(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public static ArrayList<ButtonNames> createButtonNamesList(String[] buttonNames) {
        int numButtons = buttonNames.length;
        ArrayList<ButtonNames> buttons = new ArrayList<ButtonNames>();

        for (int i = 0; i < numButtons; i++) {
            buttons.add(new ButtonNames(buttonNames[i]));
        }

        return buttons;
    }
}

package com.example.firstapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MpagerAdapter extends PagerAdapter {
    private int layouts[];

    public MpagerAdapter(int[] layouts, LayoutInflater layoutInflater, Context context) {
        this.layouts = layouts;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    private LayoutInflater layoutInflater;
    private Context context;

    @Override
    public int getCount() {
        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(layouts[position],container,false );

        return super.instantiateItem(container, position);
    }
}

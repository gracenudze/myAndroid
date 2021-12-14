package com.example.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SectionTwoAdapter extends RecyclerView.Adapter<SectionTwoAdapter.ViewHolder> {
    private List<ButtonImage> mImages;

    public SectionTwoAdapter(ArrayList<ButtonImage> imageButtons) {
        this.mImages = imageButtons;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton btnImg;

        public ViewHolder( View itemView) {
            super(itemView);
            btnImg = itemView.findViewById(R.id.btnImg);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View buttonsView = inflater.inflate(R.layout.secondsection_items,
                parent, false);

        // Return a new holder instance
        SectionTwoAdapter.ViewHolder viewHolder = new SectionTwoAdapter.ViewHolder(buttonsView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ButtonImage imageButton = mImages.get(position);

        ImageButton imageButton1 = holder.btnImg;
        imageButton1.setImageResource(imageButton.getButtonImage());
        imageButton1.setEnabled(true);

    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }
}

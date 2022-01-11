package com.example.firstapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapplication.CryptoImages;
import com.example.firstapplication.R;

import java.util.ArrayList;

public class SecondSlideAdapter extends RecyclerView.Adapter<SecondSlideAdapter.ViewHolder> {
    private ArrayList<CryptoImages> mCryptoPictures;
    private ArrayList<String> mCryptoNames;

    public SecondSlideAdapter(ArrayList<CryptoImages> cryptoPictures, ArrayList<String> cryptoNames) {
        this.mCryptoPictures = cryptoPictures;
        this.mCryptoNames = cryptoNames;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FrameLayout imageFrame;
        ImageView image;
        TextView imageName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageFrame = itemView.findViewById(R.id.frameCrypto);
            image = itemView.findViewById(R.id.ivCrypto);
            imageName = itemView.findViewById(R.id.tvCryptoNames);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View cryptoViews =inflater.inflate(R.layout.second_slide_items1,
                parent, false);

        // Return a new holder instance
        SecondSlideAdapter.ViewHolder viewHolder = new SecondSlideAdapter.ViewHolder(cryptoViews);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CryptoImages cryptoImages = mCryptoPictures.get(position);
        holder.imageName.setText(); mCryptoNames.get(position);

        FrameLayout frameLayout = holder.imageFrame;
        frameLayout.getContext();

        ImageView cryptoPics = holder.image;
        cryptoPics.setImageResource(cryptoImages.getCryptoImages());
        cryptoPics.setEnabled(true);

    }

    @Override
    public int getItemCount() {
        return mCryptoPictures.size();
    }
}
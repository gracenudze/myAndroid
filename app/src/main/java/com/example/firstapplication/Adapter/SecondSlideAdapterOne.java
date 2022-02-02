package com.example.firstapplication.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapplication.FirstCryptoList;
import com.example.firstapplication.R;

import java.util.ArrayList;

public class SecondSlideAdapterOne extends RecyclerView.Adapter<SecondSlideAdapterOne.ViewHolder> {
    private ArrayList<FirstCryptoList> mFirstCryptoList;

    public SecondSlideAdapterOne(ArrayList<FirstCryptoList> firstCryptoList) {
        this.mFirstCryptoList = firstCryptoList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        FrameLayout imageFrame;
        ImageView cryptoIcons, holdingsLogo;
        TextView imageName, cryptoHoldings, cryptoPercents;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            imageFrame = itemView.findViewById(R.id.frameCrypto);
            cryptoIcons = itemView.findViewById(R.id.ivCrypto);
            imageName = itemView.findViewById(R.id.tvCryptoNames);
            holdingsLogo = itemView.findViewById(R.id.ivLogo);
            cryptoHoldings = itemView.findViewById(R.id.tvCryptoHoldings);
            cryptoPercents = itemView.findViewById(R.id.tvCryptoPercentages);
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
        SecondSlideAdapterOne.ViewHolder viewHolder = new SecondSlideAdapterOne.ViewHolder(cryptoViews);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FirstCryptoList firstCryptoList1 = mFirstCryptoList.get(position);
        ImageView cryptoPics = holder.cryptoIcons;
        cryptoPics.setImageResource(firstCryptoList1.getCryptoImages());
        cryptoPics.setEnabled(true);

        holder.imageName.setText(firstCryptoList1.getCryptoNames());
        holder.holdingsLogo.setColorFilter(Color.rgb(104,188,176));

        holder.cryptoHoldings.setText(firstCryptoList1.getCryptoHoldings());
        holder.cryptoHoldings.setTextColor(Color.rgb(104,188,176));

        holder.cryptoPercents.setText(firstCryptoList1.getCryptoPercent());
        holder.cryptoPercents.setTextColor(Color.rgb(104,188,176));
    }

    @Override
    public int getItemCount() {
        return mFirstCryptoList.size();
    }
}
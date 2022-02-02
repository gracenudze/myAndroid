package com.example.firstapplication.Adapter;

import android.content.Context;
<<<<<<< HEAD
import android.graphics.Color;
=======
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
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
<<<<<<< HEAD
=======
//    private ArrayList<String> mCryptoNames;
>>>>>>> 6dd54416544f737123158010298a86a385aed31d

    public SecondSlideAdapterOne(ArrayList<FirstCryptoList> firstCryptoList) {
        this.mFirstCryptoList = firstCryptoList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        FrameLayout imageFrame;
<<<<<<< HEAD
        ImageView cryptoIcons, holdingsLogo;
        TextView imageName, cryptoHoldings, cryptoPercents;
=======
        ImageView image;
        TextView imageName;
>>>>>>> 6dd54416544f737123158010298a86a385aed31d

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            imageFrame = itemView.findViewById(R.id.frameCrypto);
<<<<<<< HEAD
            cryptoIcons = itemView.findViewById(R.id.ivCrypto);
            imageName = itemView.findViewById(R.id.tvCryptoNames);
            holdingsLogo = itemView.findViewById(R.id.ivLogo);
            cryptoHoldings = itemView.findViewById(R.id.tvCryptoHoldings);
            cryptoPercents = itemView.findViewById(R.id.tvCryptoPercentages);
=======
            image = itemView.findViewById(R.id.ivCrypto);
            imageName = itemView.findViewById(R.id.tvCryptoNames);
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
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
<<<<<<< HEAD
        ImageView cryptoPics = holder.cryptoIcons;
=======
        ImageView cryptoPics = holder.image;
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
        cryptoPics.setImageResource(firstCryptoList1.getCryptoImages());
        cryptoPics.setEnabled(true);

        holder.imageName.setText(firstCryptoList1.getCryptoNames());
<<<<<<< HEAD
        holder.holdingsLogo.setColorFilter(Color.rgb(104,188,176));

        holder.cryptoHoldings.setText(firstCryptoList1.getCryptoHoldings());
        holder.cryptoHoldings.setTextColor(Color.rgb(104,188,176));

        holder.cryptoPercents.setText(firstCryptoList1.getCryptoPercent());
        holder.cryptoPercents.setTextColor(Color.rgb(104,188,176));
=======

>>>>>>> 6dd54416544f737123158010298a86a385aed31d
    }

    @Override
    public int getItemCount() {
        return mFirstCryptoList.size();
    }
}
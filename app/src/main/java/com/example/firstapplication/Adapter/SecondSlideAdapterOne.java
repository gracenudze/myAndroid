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
    public String mColors[] = {"ffeeec", "#f9f7eb","#f9f7eb"};

    public SecondSlideAdapterOne(ArrayList<FirstCryptoList> firstCryptoList) {
        this.mFirstCryptoList = firstCryptoList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        FrameLayout imageFrame;
        ImageView image;
        TextView imageName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            imageFrame = itemView.findViewById(R.id.frameCrypto);
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
        SecondSlideAdapterOne.ViewHolder viewHolder = new SecondSlideAdapterOne.ViewHolder(cryptoViews);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FirstCryptoList firstCryptoList1 = mFirstCryptoList.get(position);
        ImageView cryptoPics = holder.image;
        cryptoPics.setImageResource(firstCryptoList1.getCryptoImages());
        cryptoPics.setEnabled(true);

        holder.imageName.setText(firstCryptoList1.getCryptoNames());

//        cryptoPics.setBackgroundColor(Color.parseColor(mColors[position % mColors.length]));

    }

    @Override
    public int getItemCount() {
        return mFirstCryptoList.size();
    }
}
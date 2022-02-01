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

import com.example.firstapplication.R;
import com.example.firstapplication.SecondCryptoList;

import java.util.ArrayList;

public class SecondSlideAdapterTwo extends RecyclerView.Adapter<SecondSlideAdapterTwo.ViewHolder> {
    private ArrayList <SecondCryptoList> mSecondCryptoList;
    String colors[] = {"#f0f2f9", "ebf0fb", "ecfafa", "fcf1ea", "e6ddf0"};


    public SecondSlideAdapterTwo(ArrayList<SecondCryptoList> secondCryptoList) {
        this.mSecondCryptoList = secondCryptoList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bitcoinLogos;
        TextView bitcoinNames;
        TextView earnings;
        TextView currencyExchange;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bitcoinLogos = itemView.findViewById(R.id.ivBitcoinLogos);
            bitcoinNames = itemView.findViewById(R.id.tvBitcoinNames);
            earnings = itemView.findViewById(R.id.tvBitcoinEarnings);
            currencyExchange = itemView.findViewById(R.id.tvCurrencyExchange);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View bitcoinsView =inflater.inflate(R.layout.second_slide_items2,
                parent, false);

        SecondSlideAdapterTwo.ViewHolder viewHolder = new SecondSlideAdapterTwo.ViewHolder(bitcoinsView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SecondCryptoList secondCryptoList = mSecondCryptoList.get(position);
        ImageView bitcoinLogos = holder.bitcoinLogos;
        bitcoinLogos.setImageResource(secondCryptoList.getBitcoinLogos());
        bitcoinLogos.setEnabled(true);

        holder.bitcoinNames.setText(secondCryptoList.getBitcoinNames());
        holder.earnings.setText(secondCryptoList.getBitcoinEarnings());
        holder.currencyExchange.setText(secondCryptoList.getCurrencyExchange());
//        bitcoinLogos.setBackgroundColor(Color.parseColor(colors[position % 4]));
    }

    @Override
    public int getItemCount() {
        return mSecondCryptoList.size();
    }
}

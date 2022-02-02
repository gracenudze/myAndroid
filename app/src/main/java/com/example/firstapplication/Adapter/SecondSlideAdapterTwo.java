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

import com.example.firstapplication.R;
import com.example.firstapplication.SecondCryptoList;

import java.util.ArrayList;

public class SecondSlideAdapterTwo extends RecyclerView.Adapter<SecondSlideAdapterTwo.ViewHolder> {
    private ArrayList <SecondCryptoList> mSecondCryptoList;

<<<<<<< HEAD
    int color[] = { R.color.lavender,R.color.blue_lavender, R.color.honeydew,
            R.color.orange_linen, R.color.light_gray};


=======
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
    public SecondSlideAdapterTwo(ArrayList<SecondCryptoList> secondCryptoList) {
        this.mSecondCryptoList = secondCryptoList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
<<<<<<< HEAD
        ImageView bitcoinLogos,holdingsLogo;
        TextView bitcoinNames,currencyExchange, earnings, tempHoldings, percentages;

=======
        ImageView bitcoinLogos;
        TextView bitcoinNames;
        TextView earnings;
>>>>>>> 6dd54416544f737123158010298a86a385aed31d

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bitcoinLogos = itemView.findViewById(R.id.ivBitcoinLogos);
            bitcoinNames = itemView.findViewById(R.id.tvBitcoinNames);
            earnings = itemView.findViewById(R.id.tvBitcoinEarnings);
<<<<<<< HEAD
            currencyExchange = itemView.findViewById(R.id.tvCurrencyExchange);
            tempHoldings = itemView.findViewById(R.id.tvTempHoldings);
            holdingsLogo = itemView.findViewById(R.id.ivLogo);
            percentages = itemView.findViewById(R.id.tvPercentages);
=======
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
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
<<<<<<< HEAD
        bitcoinLogos.setBackgroundResource(color[position]);
=======
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
        bitcoinLogos.setEnabled(true);

        holder.bitcoinNames.setText(secondCryptoList.getBitcoinNames());
        holder.earnings.setText(secondCryptoList.getBitcoinEarnings());
<<<<<<< HEAD
        holder.currencyExchange.setText(secondCryptoList.getCurrencyExchange());
        holder.tempHoldings.setText(secondCryptoList.getTempHoldings());
        holder.percentages.setText(secondCryptoList.getPercentages());

        if (position % 5 == 3 || (position % 5 == 4))
        {
            holder.tempHoldings.setTextColor(Color.rgb(229,150,150));
            holder.holdingsLogo.setImageResource(R.drawable.down_logo);
            holder.holdingsLogo.setColorFilter(Color.rgb(229,150,150));
            holder.percentages.setTextColor(Color.rgb(229,150,150));
        }
        else {
            holder.tempHoldings.setTextColor(Color.rgb(104,188,176));
            holder.holdingsLogo.setColorFilter(Color.rgb(104,188,176));
            holder.percentages.setTextColor(Color.rgb(104,188,176));
        }
=======
>>>>>>> 6dd54416544f737123158010298a86a385aed31d
    }

    @Override
    public int getItemCount() {
        return mSecondCryptoList.size();
    }
}

package com.example.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SectionOneAdapter extends RecyclerView.Adapter<SectionOneAdapter.ViewHolder>{

    private List<ButtonNames> mButtonNames;

    public SectionOneAdapter(List<ButtonNames> buttonNames) {
        this.mButtonNames = buttonNames;

    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public Button btnNew;

        public ViewHolder( View itemView) {
            super(itemView);
            btnNew = (Button) itemView.findViewById(R.id.btnNew);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View buttonView = inflater.inflate(R.layout.firstsection_buttons_items,
                parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(buttonView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ButtonNames buttonNames = mButtonNames.get(position);

        // Set item views based on your views and data model

        Button button = holder.btnNew;
        button.setText(buttonNames.getName());
        button.setEnabled(true);
    }

    @Override
    public int getItemCount() {
        return mButtonNames.size();
    }


}

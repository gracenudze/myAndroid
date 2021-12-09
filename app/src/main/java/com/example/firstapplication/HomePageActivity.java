package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    ArrayList<ButtonNames> buttonNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView tvUsername = findViewById(R.id.tvUsername);
        tvUsername.setText(new StringBuilder().append(getIntent().getExtras().getString(ConstantUtils.firstName))
                .append(" ").append(getIntent().getExtras().getString(ConstantUtils.lastName)).toString());

        // Lookup the recyclerview in activity layout
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Initialize contacts
        buttonNames = ButtonNames.createButtonNamesList(4);
        // Create adapter passing in the sample user data
         RecyclerViewAdapter adapter = new RecyclerViewAdapter(buttonNames);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        // Set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // That's all!
    }
}
package com.example.firstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.firstapplication.Adapter.HomePageAdapterOne;
import com.example.firstapplication.Adapter.HomePageAdapterTwo;
import com.example.firstapplication.ButtonImage;
import com.example.firstapplication.ButtonNames;
import com.example.firstapplication.R;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    ArrayList<ButtonNames> buttonNames;
    ArrayList<ButtonImage> buttonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

//        TextView tvUsername = findViewById(R.id.tvUsername);
//        tvUsername.setText(new StringBuilder().append(getIntent().getExtras().getString(ConstantUtils.firstName))
//                .append(" ").append(getIntent().getExtras().getString(ConstantUtils.lastName)).toString());

        // Lookup the recyclerview in activity layout
        RecyclerView recyclerView = findViewById(R.id.rvFirstButtons);
        // Initialize buttons
        String[] descriptions = {"New", "Trending", "Popular", "Top Services"};
        buttonNames = ButtonNames.createButtonNamesList(descriptions);
        // Create adapter passing in the button names
         HomePageAdapterOne adapter = new HomePageAdapterOne(buttonNames);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        //setting layout
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager
                (HomePageActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);

        //Section Two RecyclerView Adapter
        RecyclerView recyclerView1 = findViewById(R.id.rvSecondButtons);
         int images[] = {
            R.drawable.button_img,
            R.drawable.button2_img,
        };
        buttonImage = ButtonImage.createButtonImageList(images);
        HomePageAdapterTwo adapter1 = new HomePageAdapterTwo(buttonImage);
        recyclerView1.setAdapter(adapter1);
        // Set layout manager to position the items
        LinearLayoutManager horizontalLayoutManager1 = new LinearLayoutManager(HomePageActivity.this,
        LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(horizontalLayoutManager1);
    }
}
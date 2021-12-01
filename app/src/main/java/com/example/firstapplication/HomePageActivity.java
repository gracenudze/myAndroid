package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView tvUsername = findViewById(R.id.tvUsername);
        tvUsername.setText(getIntent().getExtras().getString(ConstantUtils.firstName) + " " +
                getIntent().getExtras().getString(ConstantUtils.lastName));

    }

}
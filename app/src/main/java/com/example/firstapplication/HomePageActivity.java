package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView viewUsername = findViewById(R.id.textViewUsername);
        TextView viewEmail = findViewById(R.id.textViewEmail);

        viewUsername.setText("Username: " + getIntent().getExtras().getString("username"));
        viewEmail.setText("Email: " + getIntent().getExtras().getString("email"));
    }

}
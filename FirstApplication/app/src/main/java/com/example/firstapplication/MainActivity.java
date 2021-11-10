package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        EditText editFirstName = findViewById(R.id.editTextFirstName);
        EditText editLastName = findViewById(R.id.editTextLastName);
        EditText editEmail = findViewById(R.id.editTextEmail);

        TextView viewFirstName = findViewById(R.id.textFirstName);
        TextView viewLastName = findViewById(R.id.textLastName);
        TextView viewEmail = findViewById(R.id.textEmail);

        viewFirstName.setText("First Name: " + editFirstName.getText().toString());
        viewLastName.setText("Last Name: " + editLastName.getText().toString());
        viewEmail.setText("Email: " + editEmail.getText().toString());
    }
}
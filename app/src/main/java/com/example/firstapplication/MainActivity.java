package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        EditText editUsername = findViewById(R.id.etUsername);
        EditText editEmail = findViewById(R.id.etEmail);
        EditText editPassword = findViewById(R.id.etPassword);
        Button registerButton = findViewById(R.id.btnRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvUsername = findViewById(R.id.etUsername);
                TextView tvEmail = findViewById(R.id.etEmail);
                TextView tvPassword = findViewById(R.id.etPassword);

                tvUsername.setText(editUsername.getText().toString());
                tvEmail.setText(editEmail.getText().toString());
                tvPassword.setText(editPassword.getText().toString());

                Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                intent.putExtra(ConstantUtils.username, editUsername.getText().toString());
                intent.putExtra(ConstantUtils.email, editEmail.getText().toString());
                startActivity(intent);
            }
        });

    }
}
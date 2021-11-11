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
        EditText editUsername = findViewById(R.id.editTextUsername);
        EditText editEmail = findViewById(R.id.editTextEmail);
        EditText editPassword = findViewById(R.id.editTextPassword);
        Button registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView viewUsername = findViewById(R.id.editTextUsername);
                TextView viewEmail = findViewById(R.id.editTextEmail);
                TextView viewPassword = findViewById(R.id.editTextPassword);

                viewUsername.setText(editUsername.getText().toString());
                viewEmail.setText(editEmail.getText().toString());
                viewPassword.setText( editPassword.getText().toString());

                Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                intent.putExtra("username",editUsername.getText().toString());
                intent.putExtra("email", editEmail.getText().toString());
                startActivity(intent);
            }
        });

    }
}
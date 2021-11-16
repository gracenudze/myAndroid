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
        EditText etFirstName = findViewById(R.id.etFirstName);
        EditText etLastName = findViewById(R.id.etLastName);
        EditText etPassword = findViewById(R.id.etPassword);
        EditText etPhoneNumber = findViewById(R.id.etPhone);
        Button registerButton = findViewById(R.id.btnRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvFirstName = findViewById(R.id.etFirstName);
                TextView tvLastName = findViewById(R.id.etLastName);
                TextView tvPassword = findViewById(R.id.etPassword);
                TextView tvPhoneNumber = findViewById(R.id.etPhone);

                tvFirstName.setText(etFirstName.getText().toString());
                tvLastName.setText(etLastName.getText().toString());
                tvPassword.setText(etPassword.getText().toString());
                tvPhoneNumber.setText(etPhoneNumber.getText().toString());

                Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                intent.putExtra(ConstantUtils.username, etFirstName.getText().toString());
                intent.putExtra(ConstantUtils.email, etLastName.getText().toString());
                startActivity(intent);
            }
        });

    }
}
package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
    }

    public void onBtnClick (View view) {
        EditText etFirstName = (TextInputEditText) findViewById(R.id.etFirstName);
        EditText etLastName = (TextInputEditText) findViewById(R.id.etLastName);
        EditText etPassword = (TextInputEditText) findViewById(R.id.etPassword);
        EditText etPhoneNumber = (TextInputEditText) findViewById(R.id.etPhone);
        Button registerButton = findViewById(R.id.btnRegister);

        registerButton.setOnClickListener(v -> {
            TextView tvFirstName = findViewById(R.id.etFirstName);
            TextView tvLastName = findViewById(R.id.etLastName);
            TextView tvPassword = findViewById(R.id.etPassword);
            TextView tvPhoneNumber = findViewById(R.id.etPhone);

            tvFirstName.setText(etFirstName.getText().toString());
            tvLastName.setText(etLastName.getText().toString());
            tvPassword.setText(etPassword.getText().toString());
            tvPhoneNumber.setText(etPhoneNumber.getText().toString());

            Intent intent = new Intent(RegisterUserActivity.this, HomePageActivity.class);
            intent.putExtra(ConstantUtils.firstName, etFirstName.getText().toString());
            intent.putExtra(ConstantUtils.lastName, etLastName.getText().toString());
            startActivity(intent);
        });

    }
}
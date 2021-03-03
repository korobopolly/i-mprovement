package com.example.glory001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginResultActivity extends AppCompatActivity {

    TextView main_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_1 = findViewById(R.id.main_1);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        String password = bundle.getString("password");

        main_1.setText(email + "/" + password);

    }
}
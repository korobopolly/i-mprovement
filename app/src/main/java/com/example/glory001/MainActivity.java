package com.example.glory001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText Email, Password;
    RelativeLayout Facebook_Login, Twitter_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Facebook_Login = findViewById(R.id.Facebook_Login);
        Twitter_Login = findViewById(R.id.Twitter_Login);

        //1. 값을 가져온다.
        //2. 클릭을 감지한다.
        //3. 1번의 값을 다음 액티비티로 넘긴다.

        String email = Email.getText().toString();
        String password = Password.getText().toString();

        Facebook_Login.setClickable(true);
        Twitter_Login.setClickable(true);
        Facebook_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email",email);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
        Twitter_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email",email);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });

    }
}
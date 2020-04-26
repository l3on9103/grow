package com.example.grow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.helloworld.R;

public class SearchActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        textView = (TextView) findViewById(R.id.welcome_mesage);
        Intent intent = getIntent();
        textView.setText("Welcome " + intent.getStringExtra("USER_NAME"));
    }
}

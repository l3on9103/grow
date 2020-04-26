package com.example.grow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.helloworld.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.home_menu, menu);
        return true;
    }*/
    public void search(View view){
        Intent intent = new Intent(this, SearchActivity.class);
        intent.putExtra("USER_NAME","Mr. X Y Z");
        startActivity(intent);
    }
}

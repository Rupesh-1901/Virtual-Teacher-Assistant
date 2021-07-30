package com.example.myapplicationcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate: 1 ");
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart: 1  ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume: 1  ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause:1  ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop:1  ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart:1  ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy: 1 ");
    }


}
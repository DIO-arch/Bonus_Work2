package com.example.bonus_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Intent i = new Intent();
        if(view.getId()==R.id.ToRandom1)
            i = new Intent(this, RandomTest.class);
        else if(view.getId()==R.id.ToBT)
            i = new Intent(this, Bluetooth_Connecter.class);
        startActivity(i);
    }
}
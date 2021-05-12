package com.example.bonus_work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Display_EXP extends Activity {
    ListView lvEXP;
    ArrayList<EXP> ary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_exp);

        lvEXP = findViewById(R.id.listViewEXP);
        Dal dal = new Dal(this);
        ary = dal.getAllEXP();

        EXP_Adapter ad = new EXP_Adapter(
                this,
                R.layout.exp_layout, ary);
    }
}
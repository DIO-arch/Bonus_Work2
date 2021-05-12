package com.example.bonus_work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Display_EXP extends Activity {
    ListView lvEXP;
    ArrayList<EXP> ary;
    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent I = new Intent();
            
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_exp);

        lvEXP = findViewById(R.id.listViewEXP);
        Dal dal = new Dal(this);
        ary = dal.getAllEXP();

        EXP_Adapter ad = new EXP_Adapter(this, R.layout.exp_layout, ary);

        lvEXP.setOnItemClickListener(onItemClickListener);
    }

}
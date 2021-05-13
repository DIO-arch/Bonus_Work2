package com.example.bonus_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class Graphs_page extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs_page);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarChart> barEntries = new ArrayList<>();

        barEntries.add(new BarChart(44f,0));
        barEntries.add(new BarChart(88f,1));
        barEntries.add(new BarChart(66f,2));
        barEntries.add(new BarChart(12f,3));
        barEntries.add(new BarChart(19f,4));
        barEntries.add(new BarChart(91f,5));
        BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");

        //ArrayList<String> theDates = new ArrayList<>();
        //theDates.add("April");
        //theDates.add("May");
        //theDates.add("June");
        //theDates.add("July");
        //theDates.add("August");
        //theDates.add("Septmber");
        //BarData theData = new BarData((IBarDataSet) theDates,barDataSet);
        //barChart.setData(theData);
    }
}
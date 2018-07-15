package com.example.mytest1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


import com.github.mikephil.charting.charts.LineChart;

public class xinlv extends AppCompatActivity {
    private LineChart lineChart;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xinlv);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        lineChart=findViewById(R.id.linearchart);
        lineChart.setNoDataText("暂时没有读取到数据");
        lineChart.setNoDataTextColor(Color.parseColor("#000000"));
    }
}

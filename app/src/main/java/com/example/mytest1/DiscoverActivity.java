package com.example.mytest1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiscoverActivity extends AppCompatActivity {
    private List<Discover>discoverList=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discover_main);
        RadioButton radioButton1=(RadioButton)findViewById(R.id.radio0);
        RadioButton radioButton2=(RadioButton)findViewById(R.id.radio1);
        RadioButton radioButton3=(RadioButton)findViewById(R.id.radio2);
        RadioButton radioButton4=(RadioButton)findViewById(R.id.radio3);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(DiscoverActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(DiscoverActivity.this,NewsActivity.class);
                startActivity(intent2);
            }
        });
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        initDiscover();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycle_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        DiscoverAdapt adapt=new DiscoverAdapt(discoverList);
        recyclerView.setAdapter(adapt);
    }

    private void initDiscover() {
        Discover shop0=new Discover(getRandomLengthName("健身器材1"),R.drawable.shop0);
        discoverList.add(shop0);
        Discover shop1=new Discover(getRandomLengthName("健身器材2"),R.drawable.shop2);
        discoverList.add(shop1);
        Discover shop2=new Discover(getRandomLengthName("健身器材3"),R.drawable.shop3);
        discoverList.add(shop2);
        Discover shop3=new Discover(getRandomLengthName("健身器材4"),R.drawable.shop4);
        discoverList.add(shop3);
        Discover shop4=new Discover(getRandomLengthName("健身器材5"),R.drawable.shop5);
        discoverList.add(shop4);
        Discover shop5=new Discover(getRandomLengthName("健身器材6"),R.drawable.shop6);
        discoverList.add(shop5);
        Discover shop6=new Discover(getRandomLengthName("健身器材7"),R.drawable.shop7);
        discoverList.add(shop6);
        Discover shop7=new Discover(getRandomLengthName("健身器材8"),R.drawable.shop8);
        discoverList.add(shop7);
        Discover shop8=new Discover(getRandomLengthName("健身器材9"),R.drawable.shop9);
        discoverList.add(shop8);
        Discover shop9=new Discover(getRandomLengthName("健身器材10"),R.drawable.shop10);
        discoverList.add(shop9);
        Discover shop10=new Discover(getRandomLengthName("健身器材10"),R.drawable.shop10);
        discoverList.add(shop10);

    }

    private String getRandomLengthName(String name) {
        Random random=new Random();
        int length=random.nextInt(4)+1;
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}

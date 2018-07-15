package com.example.mytest1;

import android.widget.RelativeLayout;

public class Healthy {
    private  String name;
    private  int imageId;

    public Healthy(String name,int imageId){
        this.name=name;
        this.imageId=imageId;

    }
    public String  getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }

}

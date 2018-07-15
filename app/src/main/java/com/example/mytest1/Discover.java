package com.example.mytest1;

public class Discover {
    private  String discovername;
    private  int discoverimageId;
    public Discover(String discovername,int discoverimageId){
        this.discoverimageId=discoverimageId;
        this.discovername=discovername;
    }

    public String getDiscovername() {
        return discovername;
    }

    public int getDiscoverimageId() {
        return discoverimageId;
    }
}

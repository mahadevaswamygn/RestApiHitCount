package com.example.urlHitCount.model;

import java.util.HashMap;

public class vist {
    private int count;
    private String name;
    private static int vis=0;


    public vist() {
    }
    public vist(String name,int count)
    {
        this.name=name;
        this.count=count;
    }

    public vist(int c) {
        vis = c;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

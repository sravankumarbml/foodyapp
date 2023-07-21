package com.example.foodyapplication.models;

public class PopularFoodsModel {
    int img;
    float rate;
    String name;

    public int getImg() {
        return img;
    }

    public float getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public PopularFoodsModel(int img, float rate, String name) {
        this.img = img;
        this.rate = rate;
        this.name = name;
    }
}

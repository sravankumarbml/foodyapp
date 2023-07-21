package com.example.foodyapplication.models;

import android.media.Image;

public class OffersModel {
    int img;
    float rate;
    int price;
    String name;
    String hotelName;
    String foodType;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public OffersModel(int img, float rate, int price, String name, String hotelName, String foodType) {
        this.img = img;
        this.rate = rate;
        this.price = price;
        this.name = name;
        this.hotelName = hotelName;
        this.foodType = foodType;
    }



}

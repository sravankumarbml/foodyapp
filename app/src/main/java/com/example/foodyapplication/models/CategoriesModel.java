package com.example.foodyapplication.models;

public class CategoriesModel {
    int img;
    String name;
    String tagName;
    String price;
    Float rating;

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getTagName() {
        return tagName;
    }

    public String getPrice() {
        return price;
    }

    public Float getRating() {
        return rating;
    }

    public CategoriesModel(int img, String name, String tagName, String price, Float rating) {
        this.img = img;
        this.name = name;
        this.tagName = tagName;
        this.price = price;
        this.rating = rating;
    }
}

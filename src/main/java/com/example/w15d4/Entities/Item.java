package com.example.w15d4.Entities;

import lombok.Getter;

@Getter
public abstract class Item {

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public int calories() {
        return calories;
    }

    public double price() {
        return price;
    }

}

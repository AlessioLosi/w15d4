package com.example.w15d4.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "Pizza")
public class Pizza extends Item {
    private String name;

    private List<Topping> toppingList;
    private boolean isXl = false;

    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(700, 4.3);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
    }

    @Override
    public int calories() {
        return super.calories() + this.toppingList.stream().mapToInt(Topping::calories).sum();
    }

    @Override
    public double price() {
        return super.price() + this.toppingList.stream().mapToDouble(Topping::price).sum();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", toppingList=" + toppingList +
                ", isXl=" + isXl +
                '}';
    }
}

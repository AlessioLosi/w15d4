package com.example.w15d4.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "Pizza")
public class Pizza extends Item {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private List<Topping> toppingList;
    @Column(nullable = false)
    private boolean isXl = false;

    public Pizza(int calories, double price) {
        super(0, 0);
    }

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

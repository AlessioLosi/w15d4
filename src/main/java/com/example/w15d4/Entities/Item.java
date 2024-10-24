package com.example.w15d4.Entities;

import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "menu")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Item {
    @Id
    @GeneratedValue  // Devi aggiungere la strategia di generazione per l'ID
    protected Long id;

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

package com.example.w15d4.Entities;

import lombok.Getter;


@Getter
public class Table {
    private int numTable;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

    public Table(int numTable, int numMaxCoperti, boolean isFree, double costoCoperto) {
        this.numTable = numTable;
        this.numMaxCoperti = numMaxCoperti;
        this.isFree = isFree;
        this.costoCoperto = costoCoperto;
    }

    public int numMaxCoperti() {
        return numMaxCoperti;
    }

    public boolean isFree() {
        return isFree;
    }

    public double costoCoperto() {
        return costoCoperto;
    }

    public int numTable() {
        return numTable;
    }

    public void print() {
        System.out.println("numero tavolo--> " + numTable);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }

}

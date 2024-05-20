package org.example;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price){

        Guitar guitar = new Guitar(serialNumber,builder,model,type,backWood,topWood,price);
        guitars.add(guitar);

    }



}

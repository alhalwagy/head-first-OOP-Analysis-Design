package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,GuitarSpec spec){



        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);

    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique

            GuitarSpec guitarSpec = guitar.getSpec();

           if(guitar.getSpec().matches(searchGuitar))
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }



}

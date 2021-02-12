package com.ethan;

import java.util.Hashtable;

public class Cars {

    static Hashtable<String, Car> inventory = new Hashtable<>();

    public static void add(Car car) {
        Cars.inventory.put(car.id, car);
    }

    public static Car getById(String id) {
        return Cars.inventory.get(id);
    }
}

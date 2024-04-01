package com.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class topshiriq_4 {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Aston Martin");
        cars.add("Ferari");
        cars.add("Porche");
        cars.add("McLaren");
        cars.add("Subaru");

//        a)

        LinkedList<String> cars2 = new LinkedList<>();
        cars2.add("RollsRoyse");
        cars2.add("Range-Rover");

        cars.addAll(cars2);
        System.out.println(cars);

//        b)

        Object copyCars = cars.clone();
        System.out.println(copyCars);

//        c)

        cars.removeFirst();
        cars.forEach(car -> {
            System.out.println(car);
        });
    }
}

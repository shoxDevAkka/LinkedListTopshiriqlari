package com.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class topshiriq_5 {
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

        System.out.println(cars);
        Collections.shuffle(cars);
        System.out.println(cars);

//        b)

        ArrayList<String> carsArrayList = new ArrayList<>(cars);

        System.out.println(carsArrayList);

//        c)

        Collections.sort(cars);
        System.out.println(cars.contains("BMW"));

    }
}

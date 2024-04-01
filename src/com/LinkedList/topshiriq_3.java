package com.LinkedList;

import java.util.LinkedList;

public class topshiriq_3 {
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

        cars.remove(6);

//        b)

        System.out.println(cars.removeFirst());
        System.out.println(cars.removeLast());

//        c)

        cars.clear();

    }
}

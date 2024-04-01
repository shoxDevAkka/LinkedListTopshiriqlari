package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class topshiriq_1 {
    public static void main(String[] args) {

//        a)
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Aston Martin");
        cars.add("Ferari");
        cars.add("Porche");
        cars.add("McLaren");
        cars.add("Subaru");

//        b)

        Iterator iterator = cars.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        c)

        System.out.println(cars.size());
        cars.clear();

    }
}

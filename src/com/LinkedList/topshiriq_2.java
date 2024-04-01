package com.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class topshiriq_2 {
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

        Iterator iterator = cars.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        b)

        cars.addFirst("RollsRoyse");
        cars.addLast("Range-Rover");

//        c)

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

    }
}

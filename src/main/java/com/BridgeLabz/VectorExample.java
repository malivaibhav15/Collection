package com.BridgeLabz;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add("Vaibhav");
        vector.add(24);
        vector.add("Mali");
        vector.add(99);

        Iterator iterator = vector.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        Vector<Integer> vector1 = new Vector<Integer>(2);
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);

        Iterator iterator1 = vector1.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        int removed = vector1.remove(2);
        System.out.println("Remeoved number = " + removed);

        Vector<String> player = new Vector<>();
        player.add("Sourav");
        player.add("Virat");
        player.add("Rahul");
        player.add("Rohit");

        System.out.println("Initial Vector " + player);
        System.out.println("Vector capacity = " + player.capacity());
        player.clear();
        System.out.println("Player after clear" + player);

    }
}

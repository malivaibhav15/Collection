package com.BridgeLabz;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Vaibhav");
        arrayList.add("Sunil");
        arrayList.add("Mali");

        System.out.println("Using for each loop");
        for (String fullName : arrayList) {
            System.out.println(fullName);
        }

        System.out.println("Using lambda expression in java 8");
        arrayList.forEach(fullName -> System.out.println(fullName));

        System.out.println("Using iterator");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

}

package oop.collections;

import oop.basics.Cat;

import java.util.ArrayList;

public class TryList {

    public static void main(String[] args) {
        // set // list // maps

        // List - allows duplicates, ordered by input
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to list
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(-3);

        // Adding elements in loop
        int[] arr = new int[]{1,2,3};
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            list.add(element);
        }

        // Getting values from list ( Old - style )
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            System.out.print(element + " ");
        }
        System.out.println("");

        // Getting values from list ( New - style )
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println("");

        // Sum of list elements
        int sum = 0;
        for (int element : list) {
            sum = sum + element;
        }
        System.out.println("sum = " + sum);

        // Remove element @ index 5
        list.remove(5);

        // Print list in comfort way
        System.out.println("list = " + list);


        // Declaration with cats
        ArrayList<Cat> cats = new ArrayList<>();

        Cat prince = new Cat();
        prince.name = "Prince";
        prince.age = 10;

        Cat murish = new Cat();
        murish.name = "Murinsh";
        murish.age = 7;

        // Adding cats in list
        cats.add(prince);
        cats.add(murish);

        // Take next cat from collection and ask to call function(s)
        for (Cat cat : cats) {
            cat.performAction();
        }


    }

}

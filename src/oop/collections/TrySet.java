package oop.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TrySet {

    public static void main(String[] args) {

        // Declare a simple HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(-2);
        hashSet.add(5);
        hashSet.add(9);

        System.out.println("hashSet = " + hashSet);

        // Iterate over HashSet
        for (int element : hashSet) {
            System.out.print(element + " ");
        }
        System.out.println("");

        // Check on contains
        boolean contains12 = hashSet.contains(12);
        System.out.println("contains12 = " + contains12);

        boolean contains3 = hashSet.contains(3);
        System.out.println("contains3 = " + contains3);

        // Remove element by value
        hashSet.remove(9);
        System.out.println("hashSet = " + hashSet);


        // LinkedHashSet preserves adding order!
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(-2);
        linkedHashSet.add(5);
        linkedHashSet.add(9);

        System.out.println("linkedHashSet = " + linkedHashSet);
    }

}

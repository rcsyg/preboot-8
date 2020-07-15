package oop.collections;

import java.util.LinkedHashSet;
import java.util.Random;

public class TeamAssigner {

    public static void main(String[] args) {
        // 1 2 3 4 -> 3 1 4 2
        // 4 3 2 1 -> 3 1 4 2

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        while (numbers.size() != 15) {
            int r = new Random().nextInt(15) + 1;
            numbers.add(r);
        }

        // System.out.println("numbers = " + numbers);
        // ----
        // 10
        // 12
        // ---

        int count = 0;
        for (Integer number : numbers) {
            if (count % 2 == 0) {
                System.out.println("---");
            }
            System.out.println(number);
            count++;
        }

    }

}

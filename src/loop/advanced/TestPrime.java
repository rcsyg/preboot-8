package loop.advanced;

import java.util.Scanner;

public class TestPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Number " + number + " is prime? : " + isPrime);

        // 2 3 5 7 11 13 17 19

        // 101
        // 2 3 4 ... 50  ... 64
    }

}

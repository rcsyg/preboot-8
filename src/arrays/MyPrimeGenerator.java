package arrays;

import java.util.Scanner;

public class MyPrimeGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of primes to generate:");
        int primesToGenerate = sc.nextInt();
        sc.close();

        int[] results = new int[primesToGenerate];
        int resultIndex = 0;
        int candidate = 2;

        while (resultIndex < primesToGenerate) {

            boolean isPrime = true;
            for (int i = 2; i < candidate; i++) {
                if (candidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                results[resultIndex] = candidate;
                resultIndex++;
            }

            candidate++;

        }

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
            if (i < results.length - 1) {
                System.out.print(", ");
            }
        }

    }

}

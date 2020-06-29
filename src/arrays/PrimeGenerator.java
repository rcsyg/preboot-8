package arrays;

import java.util.Scanner;

public class PrimeGenerator {

    public static void main(String[] args) {

        /*
        * 1) Get number from user;
        * 2) Create an array of specified size (size - number that we got from user)
        * 3) Create some variable that store index of last inserted found number
        * arr : [2; 3; 5; ; ; ; ; ;]
        *          index |
        * 4) Hold a next candidate to test
        * while (index < user-entered-number) {
        *
        *   test if it is prime
        *   if prime {
        *       put in resulting array
        *       index++;
        *   }
        *
        *   candidate++;
        * }
        *
        * last) print results
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter primes to generate:");
        int primesToGenerate = sc.nextInt();
        sc.close();

        int[] primes = new int[primesToGenerate];
        int resultIndex = 0;
        int candidate = 2;

        while (resultIndex < primesToGenerate) {

            boolean isPrime = true;
            /*for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }*/
            if(isPrime) {
                /*
                * put [candidate] in resulting array
                * */
                resultIndex++;
            }

            candidate++;
        }

        // last) print results
    }

}

package loop.basic;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // 6! = 6 * 5 * 4 * 3 * 2 * 1 * 1 = 720
        // 6! = 1 * 1 * 2 * 3 * 4 * 5 * 6 = 720
        // input < 20

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        sc.close();

        int i = 1;
        int fact = 1;
        while ( i <= number) {
            fact = fact * i;
            // fact *= i;
            i++;
        }

        System.out.println("fact = " + fact);


    }

}

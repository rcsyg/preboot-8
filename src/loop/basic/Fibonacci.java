package loop.basic;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // 0   1   1    2    3 5 8 13 21 ...
        // f1 f2
        //    f1  f2
        //        f1   f2

        int f1 = 0;
        int f2 = 1;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        sc.close();

        System.out.print(f1 + " " + f2 + " ");

        int i = 2;
        while (i <= number) {
            sum = f1 + f2;
            System.out.print(sum + " ");
            f1 = f2;
            f2 = sum;
            i++;
        }

    }

}

package loop.advanced;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int r = new Random().nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        boolean userGuessed = false;

        while (!userGuessed) {
            System.out.println("Enter number:");
            int number = sc.nextInt();
            if (number == r) {
                userGuessed = true;
                System.out.println("Congratulations!");
            } else if ( number < r) {
                System.out.println("Try bigger!");
            } else {
                System.out.println("Try smaller!");
            }
        }

        sc.close();
    }

}

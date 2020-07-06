package oop.basics;

import java.util.Scanner;

public class SquareEquation {

    /*
	* 	x^2 + 3x -4 = 0 (2 saknes)
		x^2 + 12x +36 = 0 (1 sakne)
		5x^2 + 3x + 7 = 0 (nav saknes)
		------------------------------
		D = b^2 - 4*a*c
		x1 = (-b - Sqrt(D)) / 2a
		x2 = (-b + Sqrt(D)) / 2a
	*
	* */

    public void calculateRoots(double a, double b, double c) {
        double d = (b * b) - 4 * (a * c);
        if (d < 0) {
            System.out.println("No roots found");
        } else if (d == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Only root = " + x1);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("1st root = " + x1);
            System.out.println("2nd root = " + x2);
        }
    }

    public static void main(String[] args) {
        SquareEquation squareEquation = new SquareEquation();

        double root = Math.sqrt(16);
        System.out.println("r = " + root);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient a:");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b:");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c:");
        double c = scanner.nextDouble();

        squareEquation.calculateRoots(a, b, c);

    }

}

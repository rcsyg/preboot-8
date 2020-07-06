package oop.geometry;

public class Geometry {

    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(5,2);
        Point c = new Point(3,5);

        Line ab = new Line(a, b);
        ab.printSelf();

        double length = ab.length();
        System.out.println("length = " + length);

    }

}

package oop.geometry;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        Line bc = new Line(b, c);
        double bcLength = bc.length();
        Line ac = new Line(a, c);
        double acLength = ac.length();
        Line ab = new Line(a, b);
        double abLength = ab.length();
        double halfPerimeter = (bcLength + acLength + abLength) / 2;

        double area = Math.sqrt(halfPerimeter *
                (halfPerimeter - abLength) *
                (halfPerimeter - acLength) *
                (halfPerimeter - bcLength));

        return area;
    }

}

package oop.geometry;

public class Line {

    // Point start, finish
    private Point start;
    private Point finish;

    // Constructor with Points
    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    // getters
    public Point getStart() {
        return start;
    }

    public Point getFinish() {
        return finish;
    }

    public void printSelf() {
        String startPoint = "[" + start.getX() + ";" + start.getY() + "]";
        String finishPoint = "[" + finish.getX() + ";" + finish.getY() + "]";
        System.out.println(startPoint + " - " + finishPoint);
    }

    public double length() {
        return 0;
    }
}

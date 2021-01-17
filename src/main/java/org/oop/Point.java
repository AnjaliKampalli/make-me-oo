package org.oop;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static int getDifference(int coordinate1, int coordinate2) {
        return coordinate1 - coordinate2;
    }

    public static double distance(Point from, Point to) {
        double xDistance = getDifference(to.x, from.x);
        double yDistance = getDifference(to.y, from.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point from, Point to) {
        double xDistance = getDifference(to.x, from.x);
        double yDistance = getDifference(to.y, from.y);
        return Math.atan2(yDistance, xDistance);
    }
}

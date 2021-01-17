package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.oop.Point.*;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double expectedDistance = 0;
        double actualDistance = distance(origin, origin);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double expectedDistance = 1;
        double actualDistanceToPoint1 = distance(origin, point1);
        double actualDistanceToPoint2 = distance(origin, point2);

        assertEquals(expectedDistance, actualDistanceToPoint1);
        assertEquals(expectedDistance, actualDistanceToPoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double expectedDistance = 2;
        double actualDistance = distance(point1, point2);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double expectedDirection = 0;
        double actualDirectionOfPoint1 = direction(origin, point1);
        double actualDirectionOfPoint2 = direction(origin, point2);

        assertEquals(expectedDirection, actualDirectionOfPoint1);
        assertEquals(expectedDirection, actualDirectionOfPoint2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double expectedDirection = Math.PI;
        double actualDirectionOfPoint1 = direction(origin, point1);
        double actualDirectionOfPoint2 = direction(origin, point2);

        assertEquals(expectedDirection, actualDirectionOfPoint1);
        assertEquals(expectedDirection, actualDirectionOfPoint2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double expectedDirection = Math.PI/2;
        double actualDirectionOfPoint1 = direction(origin, point1);
        double actualDirectionOfPoint2 = direction(origin, point2);

        assertEquals(expectedDirection, actualDirectionOfPoint1);
        assertEquals(expectedDirection, actualDirectionOfPoint2);
    }
}

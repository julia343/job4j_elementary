package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceAtoB() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceBtoC() {
        int x1 = -1;
        int y1 = 4;
        int x2 = 2;
        int y2 = -3;
        double expected = 7.615773105863909;
        double out = Point.distance(-1, 4, 2, -3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceCtoD() {
        int x1 = -5;
        int y1 = 1;
        int x2 = 3;
        int y2 = 6;
        double expected = 9.433981132056603;
        double out = Point.distance(-5, 1, 3, 6);
        Assert.assertEquals(expected, out, 0.01);
    }
}
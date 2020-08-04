package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceAtoB() {
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceBtoC() {
        double expected = 7.62;
        double out = Point.distance(-1, 4, 2, -3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceCtoD() {
        double expected = 9.43;
        double out = Point.distance(-5, 1, 3, 6);
        Assert.assertEquals(expected, out, 0.01);
    }
}
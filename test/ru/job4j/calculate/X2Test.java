package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenBCZero1() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected = 3;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        assertThat(rsl1, is(expected));
    }

    @Test
    public void whenBCZero2() {
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int expected = 2;
        int rsl2 = X2.calc(a2, b2, c2, x2);
        assertThat(rsl2, is(expected));
    }

    @Test
    public void whenBCZero3() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int expected = 2;
        int rsl3 = X2.calc(a3, b3, c3, x3);
        assertThat(rsl3, is(expected));
    }

    @Test
    public void whenBCZero4() {
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int expected = 1;
        int rsl4 = X2.calc(a4, b4, c4, x4);
        assertThat(rsl4, is(expected));
    }
}
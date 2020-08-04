package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(6, 8, 0);
        assertThat(result, is(8));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 1, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax() {
        int result = MultiMax.max(2, 2, 2);
        assertThat(result, is(2));
    }
}
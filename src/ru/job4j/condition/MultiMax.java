package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = (first > second) ? first : second;
        rsl = rsl > third ? rsl : third;
        return rsl;
    }

    public static void main(String[] args) {
        int max = MultiMax.max(87, 2, 45);
        System.out.println(max);
    }
}


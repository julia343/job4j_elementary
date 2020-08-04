package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        return (first > second) ? ((first > third) ? first : third) : ((second > third) ? second : third);
    }

    public static void main(String[] args) {
        int max = MultiMax.max(87, 2, 45);
        System.out.println(max);
    }
}


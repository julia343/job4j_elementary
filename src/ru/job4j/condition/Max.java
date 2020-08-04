package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int max = Max.max(33, 45);
        System.out.println(max);
        int max1 = Max.max(5, 2);
        System.out.println(max1);
        int max2 = Max.max(4, 4);
        System.out.println(max2);
    }
}

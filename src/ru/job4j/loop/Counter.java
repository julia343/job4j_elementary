package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
            return sum;
    }

    public static void main(String[] args) {
        int sum = Counter.sum(0, 10);
        System.out.println(sum);
        int sum1 = Counter.sum(3, 8);
        System.out.println(sum1);
        int sum2 = Counter.sum(1, 1);
        System.out.println(sum2);
    }
}

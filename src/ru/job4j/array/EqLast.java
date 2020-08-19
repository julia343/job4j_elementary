package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int endleft = left[left.length - 1];
        int endright = right[right.length - 1];
                if (endleft == endright) {
                    return true;
                }
        return false;
    }
}
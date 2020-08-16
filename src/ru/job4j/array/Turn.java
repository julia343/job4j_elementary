package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int middle = array.length / 2;
        int length = array.length;
        for (int index = 0; index < middle; index++) {
            int TurnIndex = length - index - 1;
            int temp = array[TurnIndex];
            array[TurnIndex] = array[index];
            array[index] = temp;
        }
        return array;
    }
}

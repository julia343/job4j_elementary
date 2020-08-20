package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = true; /* добавить условие, по которому нужно определить ставить ли символ или нет. */
                boolean right = true; /* добавить условие, что нужно ставить элемент в правый угол. */
                if (row == cell && (row + cell) % 2 == 0) {
                    System.out.print("0");
                } else if (row + cell == size - 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }
}
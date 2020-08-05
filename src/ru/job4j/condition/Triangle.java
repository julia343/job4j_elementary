package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean exist = Triangle.exist(2, 2, 2);
        System.out.println(exist);
        boolean exist1 = Triangle.exist(2, 2, 5);
        System.out.println(exist1);
    }
}

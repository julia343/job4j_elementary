package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl1 = value / 70;
        return rsl1;
    }

    public static int rubleToDollar(int value) {
        int rsl2 = value / 60;
        return rsl2;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}

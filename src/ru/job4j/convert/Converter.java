package ru.job4j.convert;

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
        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        int in2 = 180;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 2. Test result : " + passed2);

        int in3 = 170;
        int expected3 = 3;
        int out3 = rubleToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("170 rubles are 3. Test result : " + passed3);

        int in4 = 190;
        int expected4 = 3;
        int out4 = rubleToDollar(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("190 rubles are 3. Test result : " + passed4);
    }

}

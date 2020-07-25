package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        double rsl = (heightMan - 100) * 1.15;
        return rsl;
}

    public static double womanWeight(short heightWoman) {
        double rsl = (heightWoman - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 185;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 185 is " + man);
        short heightWoman = 163;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 163 is " + woman);
    }
}

package ru.gmail.romanov1234567890987.util;


import java.util.Random;

public class RandomUtil {
    public static final Random RANDOM = new Random();

    public static int[] getRandomIntegerArray(int count, int bound) {
        int[] integers = new int[count];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = bound - RANDOM.nextInt((bound * 2) + 1);
        }
        return integers;
    }
}

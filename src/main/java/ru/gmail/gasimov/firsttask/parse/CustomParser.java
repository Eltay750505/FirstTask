package ru.gmail.gasimov.firsttask.parse;

import java.util.Arrays;

public class CustomParser {
    public static final String SEPARATOR = " ";
    public int[] parseStringIntoIntArray(String string) {
        int[] numbers = Arrays
                .stream(string.split(SEPARATOR))
                .mapToInt(Integer::parseInt)
                .toArray();
        return numbers;
    }
}


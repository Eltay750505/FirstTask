package ru.gmail.romanov1234567890987.parse;

import java.util.Arrays;

public class CustomParser {
    public int[] parseStringIntoIntArray(String string) {
        int[] numbers = Arrays
                .stream(string.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return numbers;
    }
}
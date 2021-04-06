package ru.gmail.gasimov.task1.parse;

import ru.gmail.gasimov.task1.exception.ArrayException;

import java.util.Arrays;

public class CustomParser {
    public static final String SEPARATOR = " ";
    public int[] parseStringIntoIntArray(String string) throws ArrayException {
        int[] resultArray;
        try {
            resultArray = Arrays
                    .stream(string.split(SEPARATOR))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e) {
            throw new ArrayException("NumberFormat exception was called, this string can't be parsed!!!");
        }
        return resultArray;
    }
}


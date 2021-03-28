package ru.gmail.romanov1234567890987.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.SearchService;

import java.util.stream.IntStream;


public class SearchServiceImpl implements SearchService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int findMin(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int min = integers[0];

        for (int i = 0; i < integers.length; i++) {
            if (min > integers[i]) {
                min = integers[i];
            }
        }
        LOGGER.log(Level.INFO, "Found min element: " + min);
        return min;
    }

    @Override
    public int findMax(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int max = integers[0];

        for (int i = 0; i < integers.length; i++) {
            if (max < integers[i]) {
                max = integers[i];
            }
        }
        LOGGER.log(Level.INFO, "Found max element: " + max);
        return max;
    }

    @Override
    public int findMinWithIntStream(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int min = IntStream
                .of(integers)
                .min()
                .getAsInt();
        return min;
    }

    @Override
    public int findMaxWithIntStream(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int max = IntStream
                .of(integers)
                .max()
                .getAsInt();
        return max;
    }
}

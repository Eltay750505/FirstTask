package ru.gmail.romanov1234567890987.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.CountService;

import java.util.stream.IntStream;


public class CountServiceImpl implements CountService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int countAverage(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        int average = sum / integers.length;
        LOGGER.log(Level.INFO, "Average: " + average);
        return average;
    }

    @Override
    public int countSum(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        LOGGER.log(Level.INFO, "Sum: " + sum);
        return sum;
    }

    @Override
    public void calculateCountOfPositiveAndNegativeElements(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int countOfPositive = 0;
        int countOfNegative = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < 0) {
                countOfNegative++;
            } else {
                countOfPositive++;
            }
        }
        LOGGER.log(Level.INFO, "Count of positive: " + countOfPositive);
        LOGGER.log(Level.INFO, "Count of negative: " + countOfNegative);
    }

    @Override
    public int countAverageWithIntStream(ArrayClass arrayClass) {
        int length = arrayClass
                .getArray()
                .length;
        int sum = countSumWithIntStream(arrayClass);
        return sum / length;
    }

    @Override
    public int countSumWithIntStream(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int sum = IntStream
                .of(integers)
                .sum();
        return sum;
    }

    @Override
    public void countPositiveAndNegativeWithIntStream(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();

        long countCountOfNegatives = IntStream
                .of(integers)
                .filter(x -> x < 0)
                .count();
        long countCountOfPositive = IntStream
                .of(integers)
                .filter(x -> x > 0)
                .count();

        LOGGER.log(Level.INFO, "Count of Negatives : " + countCountOfNegatives);
        LOGGER.log(Level.INFO, "Count of Positives : " + countCountOfPositive);
    }
}

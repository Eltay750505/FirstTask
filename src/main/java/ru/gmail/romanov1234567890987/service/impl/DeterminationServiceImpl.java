package ru.gmail.romanov1234567890987.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.DeterminationService;

import java.lang.invoke.MethodHandles;

public class DeterminationServiceImpl implements DeterminationService {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public int determineAverage(ArrayClass arrayClass) {
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
    public int determineSum(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        LOGGER.log(Level.INFO, "Sum: " + sum);
        return sum;
    }

    @Override
    public void determineCountOfPositiveAndNegativeElements(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int countOfPositive = 0;
        int countOfNegative = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < 0){
                countOfNegative++;
            }else{
                countOfPositive++;
            }
        }
        LOGGER.log(Level.INFO, "Count of positive: " + countOfPositive);
        LOGGER.log(Level.INFO, "Count of negative: " + countOfNegative);
    }
}

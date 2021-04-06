package ru.gmail.gasimov.task1.service;

import ru.gmail.gasimov.task1.model.ArrayClass;

public interface CountService {
    int countAverage(ArrayClass arrayClass);

    int countSum(ArrayClass arrayClass);

    int[] calculateCountOfPositiveAndNegativeElements(ArrayClass arrayClass);

    int countAverageWithIntStream(ArrayClass arrayClass);

    int countSumWithIntStream(ArrayClass arrayClass);

    int[] countPositiveAndNegativeWithIntStream(ArrayClass arrayClass);
}

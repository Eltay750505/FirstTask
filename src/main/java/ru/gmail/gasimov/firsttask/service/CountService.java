package ru.gmail.gasimov.firsttask.service;

import ru.gmail.gasimov.firsttask.model.ArrayClass;

public interface CountService {
    int countAverage(ArrayClass arrayClass);

    int countSum(ArrayClass arrayClass);

    int[] calculateCountOfPositiveAndNegativeElements(ArrayClass arrayClass);

    int countAverageWithIntStream(ArrayClass arrayClass);

    int countSumWithIntStream(ArrayClass arrayClass);

    int[] countPositiveAndNegativeWithIntStream(ArrayClass arrayClass);
}

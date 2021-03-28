package ru.gmail.romanov1234567890987.service;

import ru.gmail.romanov1234567890987.model.ArrayClass;

public interface CountService {
    int countAverage(ArrayClass arrayClass);

    int countSum(ArrayClass arrayClass);

    void calculateCountOfPositiveAndNegativeElements(ArrayClass arrayClass);

    int countAverageWithIntStream(ArrayClass arrayClass);

    int countSumWithIntStream(ArrayClass arrayClass);

    void countPositiveAndNegativeWithIntStream(ArrayClass arrayClass);
}

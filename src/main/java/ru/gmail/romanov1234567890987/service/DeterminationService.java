package ru.gmail.romanov1234567890987.service;

import ru.gmail.romanov1234567890987.model.ArrayClass;

public interface DeterminationService {
    int determineAverage(ArrayClass arrayClass);

    int determineSum(ArrayClass arrayClass);

    void determineCountOfPositiveAndNegativeElements(ArrayClass arrayClass);
}

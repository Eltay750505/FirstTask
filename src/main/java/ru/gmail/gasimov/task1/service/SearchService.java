package ru.gmail.gasimov.task1.service;

import ru.gmail.gasimov.task1.model.ArrayClass;

public interface SearchService {
    int findMin(ArrayClass arrayClass);

    int findMax(ArrayClass arrayClass);

    int findMinWithIntStream(ArrayClass arrayClass);

    int findMaxWithIntStream(ArrayClass arrayClass);
}

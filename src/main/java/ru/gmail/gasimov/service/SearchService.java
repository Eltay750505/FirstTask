package ru.gmail.gasimov.service;

import ru.gmail.gasimov.model.ArrayClass;

public interface SearchService {
    int findMin(ArrayClass arrayClass);

    int findMax(ArrayClass arrayClass);

    int findMinWithIntStream(ArrayClass arrayClass);

    int findMaxWithIntStream(ArrayClass arrayClass);
}

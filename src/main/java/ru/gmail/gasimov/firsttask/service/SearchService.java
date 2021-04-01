package ru.gmail.gasimov.firsttask.service;

import ru.gmail.gasimov.firsttask.model.ArrayClass;

public interface SearchService {
    int findMin(ArrayClass arrayClass);

    int findMax(ArrayClass arrayClass);

    int findMinWithIntStream(ArrayClass arrayClass);

    int findMaxWithIntStream(ArrayClass arrayClass);
}

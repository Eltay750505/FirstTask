package ru.gmail.gasimov.task1.service;

import ru.gmail.gasimov.task1.model.ArrayClass;

public interface SortService {
    int[] shellSort(ArrayClass arrayClass);

    int[] shakerSort(ArrayClass arrayClass);

    int[] bubbleSort(ArrayClass arrayClass);

    int[] sortWithIntStream(ArrayClass arrayClass);
}

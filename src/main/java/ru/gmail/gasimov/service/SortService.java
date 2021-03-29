package ru.gmail.gasimov.service;

import ru.gmail.gasimov.model.ArrayClass;

public interface SortService {
    int[] shellSort(ArrayClass arrayClass);

    int[] shakerSort(ArrayClass arrayClass);

    int[] bubbleSort(ArrayClass arrayClass);

    int[] sortWithIntStream(ArrayClass arrayClass);
}

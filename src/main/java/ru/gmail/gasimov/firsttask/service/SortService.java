package ru.gmail.gasimov.firsttask.service;

import ru.gmail.gasimov.firsttask.model.ArrayClass;

public interface SortService {
    int[] shellSort(ArrayClass arrayClass);

    int[] shakerSort(ArrayClass arrayClass);

    int[] bubbleSort(ArrayClass arrayClass);

    int[] sortWithIntStream(ArrayClass arrayClass);
}

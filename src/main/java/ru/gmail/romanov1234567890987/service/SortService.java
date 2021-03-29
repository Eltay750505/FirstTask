package ru.gmail.romanov1234567890987.service;

import ru.gmail.romanov1234567890987.model.ArrayClass;

public interface SortService {
    int[] shellSort(ArrayClass arrayClass);

    int[] shakerSort(ArrayClass arrayClass);

    int[] bubbleSort(ArrayClass arrayClass);

    int[] sortWithIntStream(ArrayClass arrayClass);
}

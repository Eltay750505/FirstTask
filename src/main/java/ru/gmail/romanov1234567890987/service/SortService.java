package ru.gmail.romanov1234567890987.service;

import ru.gmail.romanov1234567890987.model.ArrayClass;

public interface SortService {
    ArrayClass shellSort(ArrayClass arrayClass);

    ArrayClass shakerSort(ArrayClass arrayClass);

    ArrayClass bubbleSort(ArrayClass arrayClass);
}

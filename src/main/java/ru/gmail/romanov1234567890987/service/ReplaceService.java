package ru.gmail.romanov1234567890987.service;

import ru.gmail.romanov1234567890987.model.ArrayClass;

import java.util.function.IntPredicate;

public interface ReplaceService {
    int[] replaceByCondition(ArrayClass arrayClass);

    int[] replaceByConditionWithIntStream(ArrayClass arrayClass, IntPredicate intPredicate, int newItem);
}

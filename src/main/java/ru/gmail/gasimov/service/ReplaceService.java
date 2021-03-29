package ru.gmail.gasimov.service;

import ru.gmail.gasimov.model.ArrayClass;

import java.util.function.IntPredicate;

public interface ReplaceService {
    int[] replaceByCondition(ArrayClass arrayClass);

    int[] replaceByConditionWithIntStream(ArrayClass arrayClass, IntPredicate intPredicate, int newItem);
}

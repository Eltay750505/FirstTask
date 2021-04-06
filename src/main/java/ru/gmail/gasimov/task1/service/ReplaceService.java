package ru.gmail.gasimov.task1.service;

import ru.gmail.gasimov.task1.model.ArrayClass;

import java.util.function.IntPredicate;

public interface ReplaceService {
    int[] replaceByCondition(ArrayClass arrayClass);

    int[] replaceByConditionWithIntStream(ArrayClass arrayClass, IntPredicate intPredicate, int newItem);
}

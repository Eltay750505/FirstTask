package ru.gmail.gasimov.firsttask.service;

import ru.gmail.gasimov.firsttask.model.ArrayClass;

import java.util.function.IntPredicate;

public interface ReplaceService {
    int[] replaceByCondition(ArrayClass arrayClass);

    int[] replaceByConditionWithIntStream(ArrayClass arrayClass, IntPredicate intPredicate, int newItem);
}

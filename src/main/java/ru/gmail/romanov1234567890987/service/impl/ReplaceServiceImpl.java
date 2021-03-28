package ru.gmail.romanov1234567890987.service.impl;

import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.ReplaceService;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ReplaceServiceImpl implements ReplaceService {
    @Override
    public int[] replaceByCondition(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < 0) {
                integers[i] = -1;
            }
        }
        return integers;
    }

    @Override
    public int[] replaceByConditionWithIntStream(ArrayClass arrayClass, IntPredicate intPredicate, int newItem) {
        int[] integers = arrayClass.getArray();
        return IntStream
                .of(integers)
                .map(currentItem -> intPredicate.test(currentItem) ? newItem : currentItem)
                .toArray();
    }
}

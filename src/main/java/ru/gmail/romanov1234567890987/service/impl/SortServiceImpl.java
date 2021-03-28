package ru.gmail.romanov1234567890987.service.impl;

import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.SortService;

import java.util.Arrays;

public class SortServiceImpl implements SortService {
    @Override
    public int[] shellSort(ArrayClass arrayClass) {
        int length = arrayClass.getArray().length;
        int[] integers = Arrays.copyOf(arrayClass.getArray(), length);
        int i, j, step;
        int tmp;
        for (step = length / 2; step > 0; step /= 2)
            for (i = step; i < length; i++) {
                tmp = integers[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < integers[j - step])
                        integers[j] = integers[j - step];
                    else
                        break;
                }
                integers[j] = tmp;
            }
        return integers;
    }

    @Override
    public int[] shakerSort(ArrayClass arrayClass) {
        int[] integers = arrayClass.getArray();
        int left = 0, right = integers.length - 1;
        int flag = 1;
        while ((left < right) && flag > 0)
        {
            flag = 0;
            for (int i = left; i<right; i++)
            {
                if (integers[i]>integers[i + 1])
                {
                    int t = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = t;
                    flag = 1;
                }
            }
            right--;
            for (int i = right; i>left; i--)
            {
                if (integers[i - 1]>integers[i])
                {
                    int t = integers[i];
                    integers[i] = integers[i - 1];
                    integers[i - 1] = t;
                    flag = 1;
                }
            }
            left++;
        }
        return integers;
    }


    @Override
    public int[] bubbleSort(ArrayClass arrayClass) {
        int length = arrayClass.getArray().length;
        int[] integers = Arrays.copyOf(arrayClass.getArray(), length);
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (integers[j - 1] > integers[j]) {
                    int temp = integers[j - 1];
                    integers[j - 1] = integers[j];
                    integers[j] = temp;
                }

            }
        }
        return integers;
    }
}

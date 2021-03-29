package ru.gmail.romanov1234567890987.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.CountService;
import ru.gmail.romanov1234567890987.service.impl.CountServiceImpl;

public class CountServiceTest extends TestCase {
    public static final CountService COUNT_SERVICE = new CountServiceImpl();

    @Test
    public void testCountAverage() {
        int expected = 4;
        int[] array = {2, 4, 6};
        ArrayClass arrayClass = new ArrayClass(array);
        int average = COUNT_SERVICE.countAverage(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }

    public void testCountSum() {
        int expected = 12;
        int[] array = {2, 4, 6};
        ArrayClass arrayClass = new ArrayClass(array);
        int average = COUNT_SERVICE.countSum(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }

    public void testCalculateCountOfPositiveElements() {
        int expected = 6;
        int[] array = {2, 4, 6, -2, 12, -3, 124, -5, 12};
        ArrayClass arrayClass = new ArrayClass(array);
        int[] ints = COUNT_SERVICE.countPositiveAndNegativeWithIntStream(arrayClass);
        int countOfPositive = ints[1];
        Assert.assertEquals(expected, countOfPositive, 0.001);
    }

    public void testCalculateCountOfNegativeElements() {
        int expected = 3;
        int[] array = {2, 4, 6, -2, 12, -3, 124, -8, 11};
        ArrayClass arrayClass = new ArrayClass(array);
        int[] ints = COUNT_SERVICE.countPositiveAndNegativeWithIntStream(arrayClass);
        int countOfPositive = ints[0];
        Assert.assertEquals(expected, countOfPositive, 0.001);
    }

    public void testCountAverageWithIntStream() {
        int expected = 5;
        int[] array = {2, 4, 6, 8};
        ArrayClass arrayClass = new ArrayClass(array);
        int average = COUNT_SERVICE.countAverageWithIntStream(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }

    public void testCountSumWithIntStream() {
        int expected = 30;
        int[] array = {2, 4, 6, 8, 10};
        ArrayClass arrayClass = new ArrayClass(array);

        int average = COUNT_SERVICE.countSumWithIntStream(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }

    public void testCountPositiveWithIntStream() {
        int expected = 6;
        int[] array = {2, 4, 6, -2, 12, -3, 124, -5, 12};
        ArrayClass arrayClass = new ArrayClass(array);
        int[] ints = COUNT_SERVICE.countPositiveAndNegativeWithIntStream(arrayClass);
        int countOfPositive = ints[1];
        Assert.assertEquals(expected, countOfPositive, 0.001);
    }

    public void testCountNegativeWithIntStream() {
        int expected = 3;
        int[] array = {2, 4, 6, -2, 12, -3, 124, -5, 12};
        ArrayClass arrayClass = new ArrayClass(array);
        int[] ints = COUNT_SERVICE.countPositiveAndNegativeWithIntStream(arrayClass);
        int countOfPositive = ints[0];
        Assert.assertEquals(expected, countOfPositive, 0.001);
    }
}
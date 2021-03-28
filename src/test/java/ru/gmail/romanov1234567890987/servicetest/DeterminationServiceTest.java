package ru.gmail.romanov1234567890987.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.CountService;
import ru.gmail.romanov1234567890987.service.impl.CountServiceImpl;

public class DeterminationServiceTest extends TestCase {

    public void testDetermineAverage() {
        int bound = 3;
        int[] array = new int[bound];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        ArrayClass arrayClass = new ArrayClass(array);
        int expected = 4;
        CountService determinationService = new CountServiceImpl();
        int average = determinationService.countAverage(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }

    public void testDetermineSum() {
        int bound = 3;
        int[] array = new int[bound];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        ArrayClass arrayClass = new ArrayClass(array);
        int expected = 12;
        CountService determinationService = new CountServiceImpl();
        int average = determinationService.countSum(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }
}
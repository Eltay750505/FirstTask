package ru.gmail.romanov1234567890987.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.DeterminationService;
import ru.gmail.romanov1234567890987.service.impl.DeterminationServiceImpl;

public class DeterminationServiceTest extends TestCase {

    public void testDetermineAverage() {
        int bound = 3;
        int[] array = new int[bound];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        ArrayClass arrayClass = new ArrayClass(array);
        int expected = 4;
        DeterminationService determinationService = new DeterminationServiceImpl();
        int average = determinationService.determineAverage(arrayClass);
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
        DeterminationService determinationService = new DeterminationServiceImpl();
        int average = determinationService.determineSum(arrayClass);
        Assert.assertEquals(expected, average, 0.001);
    }
}
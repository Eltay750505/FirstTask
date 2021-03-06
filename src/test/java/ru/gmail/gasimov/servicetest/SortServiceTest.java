package ru.gmail.gasimov.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.gasimov.task1.model.ArrayClass;
import ru.gmail.gasimov.task1.service.SortService;
import ru.gmail.gasimov.task1.service.impl.SortServiceImpl;


public class SortServiceTest extends TestCase {
    public static final int[] INTEGERS = {12, -22, 5, 10, 2, -7, 12, -1};
    public static final SortService SORT_SERVICE = new SortServiceImpl();
    public static final int[] EXPECTED = {-22, -7, -1, 2, 5, 10, 12, 12};

    public void testShellSort() {
        ArrayClass arrayClass = new ArrayClass(INTEGERS);
        int[] ints = SORT_SERVICE.shellSort(arrayClass);
        Assert.assertArrayEquals(ints, EXPECTED);
    }

    public void testShakerSort() {
        ArrayClass arrayClass = new ArrayClass(INTEGERS);
        int[] ints = SORT_SERVICE.shakerSort(arrayClass);
        Assert.assertArrayEquals(ints, EXPECTED);
    }

    public void testBubbleSort() {
        ArrayClass arrayClass = new ArrayClass(INTEGERS);
        int[] ints = SORT_SERVICE.bubbleSort(arrayClass);
        Assert.assertArrayEquals(ints, EXPECTED);
    }

    public void testSortWithIntStream() {
        ArrayClass arrayClass = new ArrayClass(INTEGERS);
        int[] ints = SORT_SERVICE.sortWithIntStream(arrayClass);
        Assert.assertArrayEquals(ints, EXPECTED);
    }
}
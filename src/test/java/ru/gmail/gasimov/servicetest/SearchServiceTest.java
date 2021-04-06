package ru.gmail.gasimov.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.gasimov.task1.model.ArrayClass;
import ru.gmail.gasimov.task1.service.SearchService;
import ru.gmail.gasimov.task1.service.impl.SearchServiceImpl;

public class SearchServiceTest extends TestCase {
    public static final int[] INTEGERS = {12, -22, 5, 10, 2, -7, 12, -1};
    public static final SearchService SEARCH_SERVICE = new SearchServiceImpl();

    public void testFindMin() {
        int expected = -22;
        ArrayClass integers = new ArrayClass(INTEGERS);
        int min = SEARCH_SERVICE.findMin(integers);
        Assert.assertEquals(min, expected, 0.001);
    }

    public void testFindMax() {
        int expected = 12;
        ArrayClass integers = new ArrayClass(INTEGERS);
        int max = SEARCH_SERVICE.findMax(integers);
        Assert.assertEquals(max, expected, 0.001);
    }
}
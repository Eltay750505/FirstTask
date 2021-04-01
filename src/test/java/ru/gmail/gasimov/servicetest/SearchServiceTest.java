package ru.gmail.gasimov.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.gasimov.firsttask.model.ArrayClass;
import ru.gmail.gasimov.firsttask.service.SearchService;
import ru.gmail.gasimov.firsttask.service.impl.SearchServiceImpl;

public class SearchServiceTest extends TestCase {
    public static final int[] INTEGERS = {12, -22, 5, 10, 2, -7, 12, -1};

    public void testFindMin() {
        int expected = -22;
        SearchService searchService = new SearchServiceImpl();
        ArrayClass integers = new ArrayClass(INTEGERS);
        int min = searchService.findMin(integers);
        Assert.assertEquals(min, expected, 0.001);
    }

    public void testFindMax() {
        int expected = 12;
        SearchService searchService = new SearchServiceImpl();
        ArrayClass integers = new ArrayClass(INTEGERS);
        int max = searchService.findMin(integers);
        Assert.assertEquals(max, expected, 0.001);
    }
}
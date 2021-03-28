package ru.gmail.romanov1234567890987.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.romanov1234567890987.model.ArrayClass;
import ru.gmail.romanov1234567890987.service.SearchService;
import ru.gmail.romanov1234567890987.service.impl.SearchServiceImpl;
import ru.gmail.romanov1234567890987.util.RandomUtil;

public class SearchServiceTest extends TestCase {

    public void testFindMin() {
        int bound = 5;
        int count = 5;
        int[] array = RandomUtil.getRandomIntegerArray(count, bound);
        SearchService searchService = new SearchServiceImpl();
        ArrayClass integers = new ArrayClass(array);
        int min = searchService.findMin(integers);
        Assert.assertNotNull(min);
    }

    public void testFindMax() {
        int bound = 5;
        int count = 5;
        int[] array = RandomUtil.getRandomIntegerArray(count, bound);
        SearchService searchService = new SearchServiceImpl();
        ArrayClass integers = new ArrayClass(array);
        int min = searchService.findMin(integers);
        Assert.assertNotNull(min);
    }
}
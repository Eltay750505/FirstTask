package ru.gmail.gasimov.servicetest;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.gmail.gasimov.task1.model.ArrayClass;
import ru.gmail.gasimov.task1.service.ReplaceService;
import ru.gmail.gasimov.task1.service.impl.ReplaceServiceImpl;

public class ReplaceServiceTest extends TestCase {
    public static final int[] INTEGERS = {12, -223};
    public static final ReplaceService REPLACE_SERVICE = new ReplaceServiceImpl();

    public void testReplaceByCondition() {
        int[] expectedInts = {12, -1};
        ArrayClass arrayClass = new ArrayClass(INTEGERS);
        int[] result = REPLACE_SERVICE.replaceByCondition(arrayClass);
        Assert.assertEquals(result[1], expectedInts[1], 0.001);
    }

    public void testReplaceByConditionWithIntStream() {
        int[] expectedInts = {12, -1};
        int newItem = -1;
        ArrayClass arrayClass = new ArrayClass(INTEGERS);
        int[] result = REPLACE_SERVICE.replaceByConditionWithIntStream(arrayClass, x -> x < 0, newItem);
        Assert.assertEquals(result[1], expectedInts[1], 0.001);
    }
}
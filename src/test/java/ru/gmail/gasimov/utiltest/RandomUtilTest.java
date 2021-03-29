package ru.gmail.gasimov.utiltest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.gmail.gasimov.util.RandomUtil;

public class RandomUtilTest extends TestCase {
    @Test
    public void testGetRandomNotNullIntegerArray() {
        int bound = 5;
        int count = 5;
        int[] randomIntegerArray = RandomUtil.getRandomIntegerArray(count, bound);
        Assert.assertNotNull(randomIntegerArray);
    }

    @Test
    public void testArrayLength() {
        int bound = 5;
        int count = 5;
        int expected = 5;
        int[] randomIntegerArray = RandomUtil.getRandomIntegerArray(count, bound);
        int arraySize = randomIntegerArray.length;
        Assert.assertEquals(arraySize, expected,0.001);
    }
}
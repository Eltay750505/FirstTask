package ru.gmail.romanov1234567890987.readerTest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.gmail.romanov1234567890987.exception.ArrayException;
import ru.gmail.romanov1234567890987.fileReader.CustomFileReader;

public class CustomFileReaderTest extends TestCase {
    public static final String PATH = "src\\main\\resources\\numbers.txt";


    @Test(expected = ArrayException.class)
    public void fileNotFoundExceptionTest() {
        String pathName = "";
        CustomFileReader customFileReader = new CustomFileReader();
        customFileReader.readCorrectStringFromFile(pathName);
    }


    public void testReadCorrectStringFromFile() {
        String expected = "1 3 43 4 5";
        CustomFileReader customFileReader = new CustomFileReader();
        String actual = customFileReader.readCorrectStringFromFile(PATH);
        Assert.assertEquals(expected, actual);
    }

    public void testReadLinesFromFile() {
    }
}
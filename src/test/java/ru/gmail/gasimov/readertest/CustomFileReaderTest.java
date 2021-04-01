package ru.gmail.gasimov.readertest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.gmail.gasimov.firsttask.exception.ArrayException;
import ru.gmail.gasimov.firsttask.filereader.CustomFileReader;

public class CustomFileReaderTest extends TestCase {
    public static final String PATH = "src\\main\\resources\\numbers.txt";


    @Test(expected = ArrayException.class)
    public void fileNotFoundExceptionTest() throws ArrayException {
        String pathName = "";
        CustomFileReader customFileReader = new CustomFileReader();
        customFileReader.readCorrectStringFromFile(pathName);
    }


    public void testReadCorrectStringFromFile() throws ArrayException {
        String expected = "1 3 43 4 5";
        CustomFileReader customFileReader = new CustomFileReader();
        String actual = customFileReader.readCorrectStringFromFile(PATH);
        Assert.assertEquals(expected, actual);
    }
}
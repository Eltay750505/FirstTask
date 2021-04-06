package ru.gmail.gasimov.readertest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.gmail.gasimov.task1.exception.ArrayException;
import ru.gmail.gasimov.task1.filereader.CustomFileReader;

public class CustomFileReaderTest extends TestCase {
    public static final String PATH = "src\\main\\resources\\data\\numbers.txt";
    public static final CustomFileReader CUSTOM_FILE_READER = new CustomFileReader();

    @Test(expected = ArrayException.class)
    public void fileNotFoundExceptionTest() throws ArrayException {
        String pathName = "";
        CUSTOM_FILE_READER.readCorrectStringFromFile(pathName);
    }


    public void testReadCorrectStringFromFile() throws ArrayException {
        String expected = "1 3  43 4 5";
        String actual = CUSTOM_FILE_READER.readCorrectStringFromFile(PATH);
        Assert.assertEquals(expected, actual);
    }
}
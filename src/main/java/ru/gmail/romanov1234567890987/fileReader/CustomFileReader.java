package ru.gmail.romanov1234567890987.fileReader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gmail.romanov1234567890987.valid.ValidationClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CustomFileReader {
    private static final Logger LOGGER = LogManager.getLogger();

    public String readCorrectStringFromFile(String pathName) {
        StringBuilder stringBuilder = new StringBuilder();
        ValidationClass validationClass = new ValidationClass();
        String[] string = readLinesFromFile(pathName)
                .split(System.lineSeparator());
        for (int i = 0; i < string.length; i++) {
            boolean isCorrect = validationClass.checkString(string[i]);
            if(isCorrect){
                stringBuilder.append(string[i]);
                break;
            }
        }
        return stringBuilder.toString();
    }

    public String readLinesFromFile(String pathName) {
        String line = new String();
        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName))) {
            line = bufferedReader.readLine();
            while (line != null) {
                stringBuffer.append(line);
                stringBuffer.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            line = stringBuffer.toString();
        } catch (IOException e) {
            LOGGER.log(Level.ERROR,"Cannot read file : " + e.getMessage());
        }
        return line;
    }
}

package ru.gmail.gasimov.task1;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gmail.gasimov.task1.exception.ArrayException;
import ru.gmail.gasimov.task1.filereader.CustomFileReader;
import ru.gmail.gasimov.task1.model.ArrayClass;
import ru.gmail.gasimov.task1.parse.CustomParser;
import ru.gmail.gasimov.task1.service.CountService;
import ru.gmail.gasimov.task1.service.ReplaceService;
import ru.gmail.gasimov.task1.service.SearchService;
import ru.gmail.gasimov.task1.service.SortService;
import ru.gmail.gasimov.task1.service.impl.CountServiceImpl;
import ru.gmail.gasimov.task1.service.impl.ReplaceServiceImpl;
import ru.gmail.gasimov.task1.service.impl.SearchServiceImpl;
import ru.gmail.gasimov.task1.service.impl.SortServiceImpl;

import java.util.Arrays;


public class App {
    public static final Logger LOGGER = LogManager.getLogger();


    public static void main(String[] args) {
        String path = "src\\main\\resources\\data\\numbers.txt";
        CustomFileReader customFileReader = new CustomFileReader();
        StringBuilder stringBuilder = new StringBuilder();
        CustomParser customParser = new CustomParser();
        ArrayClass arrayClass = new ArrayClass();
        try {
            stringBuilder.append(customFileReader.readCorrectStringFromFile(path));
            int[] integers = customParser.parseStringIntoIntArray(stringBuilder.toString());
            arrayClass.setArray(integers);
        } catch (ArrayException e) {
            LOGGER.log(Level.ERROR, "There is no correct string");
        }

        CountService countService = new CountServiceImpl();
        int average = countService.countAverage(arrayClass);
        int sum = countService.countSum(arrayClass);
        int[] countPositiveAndNegative = countService.calculateCountOfPositiveAndNegativeElements(arrayClass);
        LOGGER.log(Level.INFO, "Average is : " + average);
        LOGGER.log(Level.INFO, "Sum is : " + sum);
        LOGGER.log(Level.INFO, "Count of negative: " + countPositiveAndNegative[0]);
        LOGGER.log(Level.INFO, "Count of positive: " + countPositiveAndNegative[1]);

        ReplaceService replaceService = new ReplaceServiceImpl();
        int[] replacedArray = replaceService.replaceByCondition(arrayClass);
        LOGGER.log(Level.INFO, "Replaced array : " + Arrays.toString(replacedArray));

        SearchService searchService = new SearchServiceImpl();
        int max = searchService.findMax(arrayClass);
        int min = searchService.findMin(arrayClass);
        LOGGER.log(Level.INFO, "max is : " + max);
        LOGGER.log(Level.INFO, "min is : " + min);

        SortService sortService = new SortServiceImpl();
        int[] bubbleSort = sortService.bubbleSort(arrayClass);
        int[] shellSort = sortService.shellSort(arrayClass);
        int[] shakerSort = sortService.shakerSort(arrayClass);
        LOGGER.log(Level.INFO, "Array sorted with bubble sort : " + Arrays.toString(bubbleSort));
        LOGGER.log(Level.INFO, "Array sorted with shell sort : " + Arrays.toString(shellSort));
        LOGGER.log(Level.INFO, "Array sorted with shaker sort : " + Arrays.toString(shakerSort));
    }
}

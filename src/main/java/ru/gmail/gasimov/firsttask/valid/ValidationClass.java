package ru.gmail.gasimov.firsttask.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClass {
    public Boolean checkString(String string) {
        Pattern regexp = Pattern.compile("(\\-?\\d+(\\s+|\\s+\\-\\s+|,\\s+|$))*");
        Matcher m = regexp.matcher(string);
        return m.matches();
    }
}
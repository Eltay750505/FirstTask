package ru.gmail.gasimov.task1.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClass {
    private static final String REGEXP_TO_CHECK = "(\\-?\\d+(\\s+|\\s+\\-\\s+|,\\s+|$))*";

    public Boolean checkString(String string) {
        Pattern regexp = Pattern.compile(REGEXP_TO_CHECK);
        Matcher m = regexp.matcher(string);
        return m.matches();
    }
}

package ru.gmail.gasimov.validtest;

import junit.framework.TestCase;
import ru.gmail.gasimov.firsttask.valid.ValidationClass;

public class ValidationClassTest extends TestCase {

    public void testCheckString() {
        String testString = "124 eqw2 wr13";
        ValidationClass validationClass = new ValidationClass();
        Boolean checkString = validationClass.checkString(testString);
        assertFalse(checkString);
    }
}

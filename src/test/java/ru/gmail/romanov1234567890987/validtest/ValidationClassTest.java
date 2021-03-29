package ru.gmail.romanov1234567890987.validtest;

import junit.framework.TestCase;
import ru.gmail.romanov1234567890987.valid.ValidationClass;

public class ValidationClassTest extends TestCase {

    public void testCheckString() {
        String testString = "124 eqw2 wr13";
        ValidationClass validationClass = new ValidationClass();
        Boolean checkString = validationClass.checkString(testString);
        assertFalse(checkString);
    }
}

package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMain {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "3, false",
                    "4, true",
                    "12, true",
                    "21, false"
            }
    )
    public void testIsInInputRange(int number, boolean expected) {
        boolean actual = Main.isInInputRange(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "\"myCoolPassword\", false",
                    "\"myCoolPassword123\", true",
                    "\"c4tf1sh\", true",
            }
    )
    public void testPasswordContainsNumbers(String password, boolean expected) {
        boolean actual = Main.passwordContainsNumbers(password);
        Assertions.assertEquals(expected, actual);
    }
}

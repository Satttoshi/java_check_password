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
                    "myCoolPassword, false",
                    "myCoolPassword123, true",
                    "c4tf1sh, true",
            }
    )
    public void testPasswordContainsNumbers(String password, boolean expected) {
        boolean actual = Main.passwordContainsNumbers(password);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "MyCoolPassword, true",
                    "mycoolpassword123, false",
                    "c4tf1sh, false",
                    "SCREAMITOUTLOUD, true",
            }
    )
    public void testPasswordContainsUpperCase(String password, boolean expected) {
        boolean actual = Main.passwordContainsUpperCase(password);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "12345, true",
                    "password, true",
                    "C4tF1sh, false",
                    "myCoolPassword123, true",
            }
    )
    public void testIsBadPassword(String password, boolean expected) {
        boolean actual = Main.isBadPassword(password);
        Assertions.assertEquals(expected, actual);
    }
}

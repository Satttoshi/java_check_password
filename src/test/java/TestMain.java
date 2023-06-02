import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMain {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "3, false",
                    "4, true",
                    "12, true",
                    "15, false"
            }
    )
    public void testIsInInputRange(int number, boolean expected) {
        boolean actual = Main.isInInputRange(number);
        Assertions.assertEquals(expected, actual);
    }

}

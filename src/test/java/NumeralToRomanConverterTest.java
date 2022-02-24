import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralToRomanConverterTest {
    @Test
    void converts1toI() {
        var romanNumeralConverter = new RomanNumeralConverter();
        String result = romanNumeralConverter.convertToRoman(1);
        Assertions.assertEquals("I", result);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    @Test
    void convertRomanNumeralToArabic() {
        var converter = new RomanNumeralConverter();

        assertEquals(1, converter.convertRomanNumeralToArabicNumber("I"));
    }
}
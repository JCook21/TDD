import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralConverterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("VI", 6),
                Arguments.of("IX", 9),
                Arguments.of("X", 10),
                Arguments.of("XIX", 19),
                Arguments.of("L", 50),
                Arguments.of("C", 100),
                Arguments.of("CLVI", 156)
        );
    }

    @ParameterizedTest(name = "It converts {0} to {1}")
    @MethodSource("dataProvider")
    void convertRomanNumeralToArabic(String romanNumeral, int expectedArabicNumber) {
        var converter = new RomanNumeralConverter();

        assertEquals(expectedArabicNumber, converter.convertRomanNumeralToArabicNumber(romanNumeral));
    }
}
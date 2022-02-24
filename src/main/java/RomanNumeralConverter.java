import java.util.Map;

public class RomanNumeralConverter {
    private final Map<String, Integer> romanDigitToNumber = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100);
    private final Map<Integer, String> numberToRomanDigit = Map.of(1, "I", 2, "II");

    public int convertRomanNumeralToArabicNumber(String romanNumeral) {
        var first = romanDigitToNumber.get(romanNumeral.substring(0, 1));
        if (romanNumeral.length() == 1) {
            return first;
        }
        var second = romanDigitToNumber.get(romanNumeral.substring(1, 2));
        if (second > first) {
            first = Math.negateExact(first);
        }

        return first + convertRomanNumeralToArabicNumber(romanNumeral.substring(1));
    }


    public String convertToRoman(int i) {
        return numberToRomanDigit.getOrDefault(i, "");
    }
}
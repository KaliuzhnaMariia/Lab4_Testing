public class RomanToArabic {

    public static int romanToArabic(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        if (!roman.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + roman);
        }

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = romanCharToValue(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    private static int romanCharToValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
        }
    }

    public static void main(String[] args) {
        String[] testRomans = {"I", "IV", "IX", "XII", "XXVII", "XLIV", "LVIII", "XC", "CCCXCIX", "CDXLIV", "CMXCIX", "M"};

        for (String roman : testRomans) {
            int arabic = romanToArabic(roman);
            System.out.println(roman + " => " + arabic);
        }
    }
}

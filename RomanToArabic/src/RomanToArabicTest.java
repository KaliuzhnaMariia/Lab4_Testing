import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToArabicTest {
    @Test
    void testRomanToArabic_ValidXII() {
        assertEquals(12, RomanToArabic.romanToArabic("XII"));
    }

    @Test
    void testRomanToArabic_ValidLVIII() {
        assertEquals(58, RomanToArabic.romanToArabic("LVIII"));
    }

    @Test
    void testRomanToArabic_ValidM() {
        assertEquals(1000, RomanToArabic.romanToArabic("M"));
    }

    @Test
    void testRomanToArabic_InvalidIIII() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic("IIII"));
    }

    @Test
    void testRomanToArabic_InvalidVV() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic("VV"));
    }

    @Test
    void testRomanToArabic_InvalidABCD() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic("ABCD"));
    }

    @Test
    void testRomanToArabic_InvalidIC() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic("IC"));
    }

    @Test
    void testRomanToArabic_InvalidIL() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic("IL"));
    }

    @Test
    void testRomanToArabic_EmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic(""));
    }

    @Test
    void testRomanToArabic_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> RomanToArabic.romanToArabic(null));
    }
}

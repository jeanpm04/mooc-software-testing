package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "msg={0}, shift={1}, expected={2}")
    @CsvSource({"abc,3,def", "xyz,3,abc", "hola,6,nuqg"})
    public void testNormalCipher(String msg, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(msg, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "msg={0}, shift={1}, expected={2}")
    @CsvSource({"aaaaaa,3,dddddd", "xxxx,3,aaaa", "ñññ,6,ttt"})
    public void repeatedCharacter(String msg, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(msg, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "msg={0}, shift={1}, expected={2}")
    @CsvSource({"'',3,invalid"})
    public void emptyString(String msg, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(msg, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "msg={0}, shift={1}, expected={2}")
    @CsvSource({
            "abc!,3,invalid", "123,3,invalid", "@bc,6,invalid",
            "te$t,3,invalid", "ñoñ,3,qrq", "HOLA,3,invalid"
    })
    public void otherCharacters(String msg, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(msg, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "msg={0}, shift={1}, expected={2}")
    @CsvSource({"abc,30,def", "abc,-5,vwx", "hola,27,hola"})
    public void outOfAlphabetLength(String msg, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(msg, shift);
        Assertions.assertEquals(expected, result);
    }
}

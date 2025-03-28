package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name="str={0}, result={1}")
    @CsvSource({"ekfgggg,true","ggxxgg,true","ggxha,true","gg,true","gxg,false"})
    public void outOfIndexGHappy(String gstring, boolean expResult){
        GHappy cadena = new GHappy();
        boolean result = cadena.gHappy(gstring);
        Assertions.assertEquals(expResult,result);
    }

    @ParameterizedTest(name="str={0}, result={1}")
    @CsvSource({"gg,true","gggg,true","gggggg,true","gggggggg,true","g,false"})
    public void allGHappy(String gstring, boolean expResult){
        GHappy cadena = new GHappy();
        boolean result = cadena.gHappy(gstring);
        Assertions.assertEquals(expResult,result);
    }

    @ParameterizedTest(name="str={0}, result={1}")
    @CsvSource({"xafwas,false","w,false","gqwewfg,false","dsaggsg,false"})
    public void noGHappy(String gstring, boolean expResult){
        GHappy cadena = new GHappy();
        boolean result = cadena.gHappy(gstring);
        Assertions.assertEquals(expResult,result);
    }

    @ParameterizedTest(name="str={0}, result={1}")
    @CsvSource({"gg,true","gxg,false","gxxg,false","gxxxg,false"})
    public void gEndAndStart(String gstring, boolean expResult){
        GHappy cadena = new GHappy();
        boolean result = cadena.gHappy(gstring);
        Assertions.assertEquals(expResult,result);
    }

    @ParameterizedTest(name="str={0}, result={1}")
    @CsvSource({"'',false"})
    public void emptyStrings(String gstring, boolean expResult){
        GHappy cadena = new GHappy();
        boolean result = cadena.gHappy(gstring);
        Assertions.assertEquals(expResult,result);
    }
}

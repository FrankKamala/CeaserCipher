import org.junit.Test;

import static org.junit.Assert.*;

public class HiderTest {
    Hider encrp=new Hider();

    @Test
    public void doTest_On_StringValue(){
        assertEquals(true,encrp.isString());

    }
 @Test
    public void doTest_On_Encoding(){
    assertEquals("bc",encrp.encoderData("HI",20));
    }
    @Test
    public  void doTest_On_Decode(){
        assertEquals("hi",encrp.decoderData("bc",20));
    }

}
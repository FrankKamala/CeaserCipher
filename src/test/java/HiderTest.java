import org.junit.Test;

import static org.junit.Assert.*;

public class HiderTest {
    Hider encrp=new Hider();

    @Test //1st test case
    public void doTest_On_StringValue(){
        assertEquals(true,encrp.isString());

    }
 @Test //.2ndtest case on Encryption or encoding
    public void doTest_On_Encoding(){
    assertEquals("bc",encrp.encoderData("HI",20));
    }

    @Test // 3rd test on Decode data
    public  void doTest_On_Decode(){
        assertEquals("hi",encrp.decoderData("bc",20));
    }

}
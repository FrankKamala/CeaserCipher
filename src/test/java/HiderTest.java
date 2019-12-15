import org.junit.Test;

import static org.junit.Assert.*;

public class HiderTest {
    Hider encrp=new Hider();

    @Test
    public void doTest_On_StringValue(){
        assertEquals(true,encrp.isString());

    }

}
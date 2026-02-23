package Github.New;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CseDemoTest {

    CseDemo cal = new CseDemo();

    @Test
    void testAdd() {
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }

    /*
   @Test
    void testMul() {
       int result = cal.mul(2, 3);
       assertEquals(6, result); 
    }
    */
}
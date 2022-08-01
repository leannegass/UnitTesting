package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    // all tests are public
    @Test
    void firstTest(){
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Given the time is 6, return good eve")
    void givenTheTimeIs6ReturnGoodEve(){
        Assertions.assertEquals("Good Mor", Greeter.getgreetings(6));
    }
    @Test
    @DisplayName("Given the time is 12, return good eve")
    void givenTheTimeIs12ReturnGoodEve(){
        Assertions.assertEquals("Good Morn", Greeter.getgreetings(12));
    }
    @Test
    @DisplayName("Given the time is 17, return good eve")
    void givenTheTimeIs17ReturnGoodEve(){
        Assertions.assertEquals("Good Aft", Greeter.getgreetings(17));
    }

}

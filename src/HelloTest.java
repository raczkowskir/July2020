//import july2020.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

//    @Test
//    void main() {
//
//    }

    @Test
    void returnOnePlusValue() {
        Hello hello = new Hello();
        assertEquals(5, hello.returnOnePlusValue(2));
    }

}
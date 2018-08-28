package Test;

import static org.junit.jupiter.api.Assertions.*;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void myFirstTest() {
        Test(1, "1");
    }

    private void Test(int input, String expected) {
        String actual = FizzBuzz.Compute(input);
        assertEquals(expected, actual);
    }
}
package Test;

import static org.junit.jupiter.api.Assertions.*;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void NonspecialNumberTests() {
        Test(1, "1");
        Test(2, "2");
        Test(4, "4");
    }

    @Test
    void FizzTests() {
        Test(3, FizzBuzz.FIZZ);
    }

    private void Test(int input, String expected) {
        String actual = FizzBuzz.Compute(input);
        assertEquals(expected, actual);
    }
}
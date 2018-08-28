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
        Test(7, "7");
        Test(14, "14");
    }

    @Test
    void FizzTests() {
        Test(3, FizzBuzz.FIZZ);
        Test(6, FizzBuzz.FIZZ);
        Test(9, FizzBuzz.FIZZ);
    }

    @Test
    void BuzzTests() {
        Test(5, FizzBuzz.BUZZ);
        Test(10, FizzBuzz.BUZZ);
    }

    @Test
    void FizzBuzzTests() {
        Test(15, FizzBuzz.FIZZBUZZ);
    }

    private void Test(int input, String expected) {
        String actual = FizzBuzz.Compute(input);
        assertEquals(expected, actual);
    }
}
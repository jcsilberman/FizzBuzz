package FizzBuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String Compute(int i) {
        if (i % 3 == 0) {
            return FIZZ;
        } else if (i % 5 == 0) {
            return BUZZ;
        } else {
            return Integer.toString(i);
        }
    }
}

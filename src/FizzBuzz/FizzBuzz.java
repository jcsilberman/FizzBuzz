package FizzBuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ+BUZZ;

    public static String Compute(int value) {

        String result = "";

        if (isDivisbleBy(value, 3)) {
            result += FIZZ;
        }

        if (isDivisbleBy(value, 5)) {
            result += BUZZ;
        }

        if (result.isEmpty()) {
            result = Integer.toString(value);
        }

        return result;
    }

    private static boolean isDivisbleBy(int value, int divisor) {
        return (value % divisor == 0);
    }
}

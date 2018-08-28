package FizzBuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ+BUZZ;

    public static String Compute(int i) {

        String result = "";

        if (i % 3 == 0) {
            result += FIZZ;
        }

        if (i % 5 == 0) {
            result += BUZZ;
        }

        if (result.isEmpty()) {
            result = Integer.toString(i);
        }

        return result;
    }
}

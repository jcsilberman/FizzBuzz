package FizzBuzz;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";

    public static String Compute(int i) {
        if (i % 3 != 0) {
            return Integer.toString(i);
        }
        else {
            return FIZZ;
        }
    }
}

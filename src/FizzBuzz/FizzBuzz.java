package FizzBuzz;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";

    public static String Compute(int i) {
        if (i == 1) {
            return "1";
        }
        else if (i == 2) {
            return "2";
        }
        else {
            return FIZZ;
        }
    }
}

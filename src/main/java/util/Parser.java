package util;

/**
 * Class is responsible for parsing data from input (it is String now)
 */
public class Parser {

    /**
     * we can add cases for another operations like division or multiplication
     */

    public static int performMathOperation(String input) {
        int[] digits = parsingDigitsInInput(input);
        String operation = parsingSignInInput(input);
        int result = 0;
        switch (operation) {
            case "-":
                result = MathFunctions.minus(digits);
                break;
            case "+":
                result = MathFunctions.plus(digits);
                break;
            default:
                throw new IllegalArgumentException("There are unacceptable arguments. Read terms and try again!");
        }
        return result;
    }

    private static int[] parsingDigitsInInput(String input) {
        String[] splitedInput = input.split(" ");
        if (splitedInput.length < 3) {
            throw new IllegalArgumentException("Entered arguments are not applicable. Please try again!");
        }
        int[] digitsInput = new int[2];
        digitsInput[0] = Integer.valueOf(splitedInput[0]);
        digitsInput[1] = Integer.valueOf(splitedInput[2]);
        return digitsInput;
    }

    private static String parsingSignInInput(String input) {
        String[] splitedInput = input.split(" ");
        if (splitedInput.length < 3) {
            throw new IllegalArgumentException("Entered arguments are not applicable. Please try again!");
        }
        return splitedInput[1];
    }
}

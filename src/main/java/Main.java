
import util.Parser;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Input two numers and + or - sign between them with spaces and press enter: ");
        String input = scanner.nextLine();
        int result = Parser.performMathOperation(input);
        System.out.println(result);
    }
}

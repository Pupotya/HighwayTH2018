package homework2;

import java.util.Scanner;

public class CastCharToInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char inputToChar = input.charAt(i);

            int answer = (int) inputToChar;

            System.out.println(inputToChar + " - " + answer);
        }
    }

}

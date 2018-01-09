package homework2;

import java.util.Scanner;

public class SumOfTwoDigitNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type two-digits number: ");
        String number = scanner.nextLine();

        int f = Character.getNumericValue(number.charAt(0));
        int s = Character.getNumericValue(number.charAt(1));

        System.out.println("Sum of numbers is: " + (f + s));

    }

}

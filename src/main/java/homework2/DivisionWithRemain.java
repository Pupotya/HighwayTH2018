package homework2;

import java.util.Scanner;

public class DivisionWithRemain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number to be divided: ");
        int q = Integer.parseInt(scanner.nextLine());
        System.out.println("Type divider: ");
        int w = Integer.parseInt(scanner.nextLine());
        if (w != 0) {
            int remainValue = q % w;
            int result = (q - remainValue) / w;
            System.out.println("Answer is : " + result + " and " + remainValue + " as remain");
        } else {
            System.out.println("DIVIDED BY ZERO");
        }


    }

}

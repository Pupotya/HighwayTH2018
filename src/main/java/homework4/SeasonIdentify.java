package homework4;

import java.util.Scanner;

public class SeasonIdentify {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number of month: ");
        int input = scanner.nextInt();
        switch (input) {
            case 12:
            case 1:
            case 2:
                System.out.println("Your month in " + "Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Your month in " + "Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Your month in " + "Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Your month in " + "Autemn");
                break;
            default:
                break;

        }
    }

}

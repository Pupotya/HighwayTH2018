package homework4;

import java.util.Scanner;

public class NameSake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type name of first person:");
        String inputFirstname = scanner.nextLine();
        System.out.println("Type name of second person:");
        String inputSecondname = scanner.nextLine();
        if(inputFirstname.toLowerCase().replaceAll(" ","").equals(inputSecondname.toLowerCase().replaceAll(" ","")))
            System.out.println("Persons are namesakes!!!");
    }
}

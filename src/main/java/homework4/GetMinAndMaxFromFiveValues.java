package homework4;

import resources.Parameters;
import resources.Resources;

import java.util.ArrayList;

public class GetMinAndMaxFromFiveValues {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = Resources.getListRandomValues(Parameters.COUNT_OF_NUMBER_EX_3);
        System.out.println("Min Value is: " + Resources.findMinFromList(numbers));
        System.out.println("Max Value is: " + Resources.findMaxFromList(numbers));

    }

}

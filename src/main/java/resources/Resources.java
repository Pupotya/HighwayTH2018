package resources;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.ArrayList;


public class Resources {
    public static ExpectedCondition<Boolean> waitForJsToLoad() {
        return new ExpectedCondition<Boolean>() {
            //            @Override
            public Boolean apply(WebDriver driver) {
                return (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState === 'complete'");
            }
        };
    }

    public static double getValuesFromBank(WebDriver driver, String selector) {
        if (selector.substring(0, 2).equals("//")) {
            String bank = driver.findElement(By.xpath(selector)).getText().substring(0, 6).replace(",", ".");
            return Double.parseDouble(bank);
        } else {
            String bank = driver.findElement(By.cssSelector(selector)).getText().substring(0, 6).replace(",", ".");
            return Double.parseDouble(bank);
        }
    }

    public static double getSellFromPrivat(WebDriver driver, String selector) {
        String bank = driver.findElement(By.cssSelector(selector)).getText().substring(10, 15).replace(",", ".");
        return Double.parseDouble(bank);
    }

    public static double getAveraged(Double[] arrayOfValues) {
        double sum = 0.0;

        for (Double val : arrayOfValues) {
            sum += val;
        }
        return sum / arrayOfValues.length;
    }

    public static int getIndexOfMinValue(Double[] arrayOfValues) {
        int minIndex = 0;
        double minVal = arrayOfValues[0];
        for (int i = 1; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] < minVal) {
                minVal = arrayOfValues[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static int getIndexOfMaxValue(Double[] arrayOfValues) {
        int maxIndex = 0;
        double minVal = arrayOfValues[0];
        for (int i = 1; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] > minVal) {
                minVal = arrayOfValues[i];
                maxIndex = i;
            }
        }
        return maxIndex;

    }

    public static String getBankByIndex(int minIndex) {
        String bank = null;
        switch (minIndex) {
            case 0:
                bank = "PRIVAT";
                break;
            case 1:
                bank = "AVAL";
                break;
            case 2:
                bank = "OSCHAD";
                break;
            case 3:
                bank = "UKRSIBB";
                break;
            case 4:
                bank = "NBU";
            default:
                break;
        }
        return bank;
    }


    private static int randomizer(){
        return (int)(Math.random()*100);
    }

    public static ArrayList<Integer> getListRandomValues(int countOfnumbers) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<countOfnumbers;i++){
            numbers.add(Resources.randomizer());
        }

        System.out.println(numbers);
        return numbers;
    }
    private static ArrayList<Integer> getListHardValues() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(21);
        numbers.add(42);
        numbers.add(-2);
        System.out.println(numbers);
        return numbers;
    }

    public static int getMax(int countOfNumbers){
//        return countOfNumbers<=4?findMaxFromList(getListHardValues()):findMaxFromList(getListRandomValues(countOfNumbers));
        return findMaxFromList(getListHardValues());
    }

    public static int getMin(int countOfNumbers){
//        return countOfNumbers<=4?findMinFromList(getListHardValues()):findMinFromList(getListRandomValues(countOfNumbers));
        return findMinFromList(getListHardValues());
    }

    public static int findMaxFromList (ArrayList<Integer> numbers) {

        int max = numbers.get(0);
        for (int val : numbers) {
            if (val > max) {
                max = val;
            }

        }
        return max;
    }

    public static int findMinFromList (ArrayList<Integer> numbers) {

        int min = numbers.get(0);
        for (int val : numbers) {
            if (val < min) {
                min = val;
            }

        }
        return min;
    }

}

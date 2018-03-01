package lesson11;

import java.util.Scanner;

public class ExceptionMuliplyCatch {

    public static void main(String[] args) {
        int[] m = {-1, 0, 1};
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            m[a] = 4 / a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) { // перехват 1
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) { // перехват 2
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (Exception e) { // перехват 3
            System.out.println("Произошло ещё какое-то исключение");
        }
    }
}

//    public void waitFor$(POEnum el) {
//        if ($(el).isDisabled()) return;
//        By by = $Selector(el);
//        WebDriverWait wait = new WebDriverWait(getDriver(), getIntProp("implicitWait"));
//        ExpectedCondition<WebElement> waiter = ExpectedConditions.visibilityOfElementLocated(by);
//        try {
//            wait.until(waiter);
//        } catch (Exception e) {
//            Assert.assertEquals("Test expectetion failed", "Wasn't able to find an element: " +
//                    el + "by selector:" + by);
//        }
//
//
//    }

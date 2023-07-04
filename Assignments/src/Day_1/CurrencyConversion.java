package Day_1;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Currency in INR : ");
        double currency = sc.nextDouble();

        System.out.println("The Currency in USD is : " + 0.012 * currency + "$");
    }
}

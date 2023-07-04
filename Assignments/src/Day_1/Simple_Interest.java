package Day_1;

import java.util.Scanner;

/*
        3. Write a program to input principal, time, and rate (P, T, R) from the user and
        find Simple Interest.
 */
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate of Interest  : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time Period in years : ");
        double time = sc.nextDouble();

        double simple_interest = principal * rate * time / 100;
        System.out.println("Simple Interest given for the above details is : " + simple_interest);
    }
}

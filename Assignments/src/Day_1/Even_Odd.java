package Day_1;

/*
        1. Write a program to print whether a number is even or odd, also take
        input from the user.

        n % 2 == 0 : even ? odd
 */

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Given Number is an EVEN Number");
        } else {
            System.out.println("Given Number is an ODD Number");
        }

    }

}

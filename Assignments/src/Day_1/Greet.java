package Day_1;

import java.util.Scanner;

/*
       2. Take name as input and print a greeting message for that particular name.
 */

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", Welcome to the Java with DSA Bootcamp !!");
    }
}

package Day_1;

import java.util.Objects;
import java.util.Scanner;

/*
        4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        (Use if conditions)
 */
public class Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Operation you need (+, -, *, /) : ");
        String operator = sc.next();

        if (Objects.equals(operator, "+")){
            System.out.println("The Addition of Two Numbers is : " + num1 + num2);
        } else if (Objects.equals(operator, "-")) {
            System.out.println("The Difference of Two Numbers is : " + (num1 - num2));
        }else if (Objects.equals(operator, "*")) {
            System.out.println("The Multiplication of Two Numbers is : " + num1 * num2);
        }else if (Objects.equals(operator, "/")) {
            System.out.println("The Division of Two Numbers is : " + num1 / num2);
        }
    }
}

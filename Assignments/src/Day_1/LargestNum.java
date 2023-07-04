package Day_1;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 2 Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is the Greatest Number");
        }else if(num2 > num1) {
            System.out.println(num2 + " is the Greatest Number");
        }else {
            System.out.println("Both the Numbers are Equal");
        }
    }
}

package Day_1;

import java.util.Scanner;

/*
        Fibonaaci Series

        0 1 1 2 3 5 8 ................
        0 1 1 1+1 2+1 ...........
 */
public class Fibonaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the series number upto which Fibonaaci series has to be Printed : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++){

            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}

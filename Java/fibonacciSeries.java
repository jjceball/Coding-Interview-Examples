/*
 * Written by Jay Ceballos
 * 6/24/22
 */

import java.util.Scanner;

public class fibonacciSeries
{
    public static void main(String[] args)
    {
        int num, a = 0, b = 0, c = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many times");
        num = in.nextInt();

        System.out.println("Fibonacci series of the number is:");

        for (int i = 0; i < num; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");
        }
    }
}

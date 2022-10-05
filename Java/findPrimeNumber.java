/*
 * Written by Jay Ceballos
 * 6/24/22
 */

import java.util.Scanner;

public class findPrimeNumber
{
    public static void main(String[] args)
    {
        int save, number;
        boolean isPrime = true;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();

        for (int i = 2; i < num/2; i++)
        {
            temp = num % i;

            if (temp == 0)
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
        {
            System.out.println(num + "is a prime number");
        }
        else
        {
            System.out.println(num + "is not a prime number");
        }
    }
}

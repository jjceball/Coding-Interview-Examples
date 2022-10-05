/*
 * Written by Jay Ceballos
 * 6/24/22
 */

import java.util.Scanner;

public class findPalindrome
{
    public static void main(String[] args)
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        int length;
        System.out.println("Enter string or number");

        original = in.nextLine();
        length = original.length();

        for (int i = length - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse))
        {
            System.out.println("The input is a palindrome");
        }
        else
        {
            System.out.println("The input is not a palindrome");
        }
    }
}

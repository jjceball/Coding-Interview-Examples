/*
 * Written by Jay Ceballos
 * 6/24/22
 */

public class reverseStringWithoutReverse
{
    public static void main(String[] args)
    {
        String str = "Jay Ceballos";

        char chars[] = str.toCharArray();

        for (int i = chars.length-1; i >= 0; i--)
        {
            System.out.print(chars[i]);
        }
    }
}

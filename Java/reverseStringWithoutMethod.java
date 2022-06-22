/*
 * Written by Jay Ceballos
 * 6/21/22
 */

public class reverseStringWithoutMethod
{
    public static void main(String[] args)
    {
        String str1 = "string1";
        StringBuilder str2 = new StringBuilder();

        str2.append(str1);
        str2 = str2.reverse();

        System.out.println(str2);
    }
}

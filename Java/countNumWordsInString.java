/*
 * Written by Jay Ceballos
 * 6/24/22
 */

import java.util.HashMap;

public class countNumWordsInString
{
    public static void main(String[] args)
    {
        String str = "This is the string that is to be counted";
        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < split.length; i++)
        {
            if (map.containsKey(split[i]))
            {
                int count = map.get(split[i]);

                map.put(split[i], count+1);
            }
            else
            {
                map.put(split[i], 1);
            }
        }

        System.out.println(map);
    }
}

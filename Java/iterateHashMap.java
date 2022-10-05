/*
 * Written by Jay Ceballos
 * 6/24/22
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterateHashMap
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Jay");
        map.put(50, "Ceballos");
        map.put(25, "HashMap");

        assert map.size() == 3;

        // While Loop
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + me.getValue());
        }

        // For Loop
        for (Map.Entry meTwo : map.entrySet())
        {
            System.out.println(meTwo.getKey() + me.getValue());
        }
    }
}

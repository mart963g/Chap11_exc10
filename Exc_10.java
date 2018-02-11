package Exc_10;

import java.util.Set;
import java.util.HashSet;

public class Exc_10
{
    public static void main(String[] args)
    {
        Set<String> strings = new HashSet<>();
        strings.add("Wuddup");
        strings.add("shit");
        strings.add("Fucking Shit!");
        strings.add("oh damn");
        strings.add("meh");
        removeEven(strings);
        System.out.println(strings);
    }

    public static void removeEven(Set<String> set)
    {
        Set<String> removeSet = new HashSet<>();
        for(String s: set)
        {
            if(s.length()%2==0)
            {
                removeSet.add(s);
            }
        }
        set.removeAll(removeSet);
    }
}

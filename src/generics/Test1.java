package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>();

        list.add("awd");
        list.add("awdwdaw");
        list.add("awdawd");

        for (Object o: list)
        {
            System.out.println(o + " lenght " + ((String)o).length());
        }
    }


}

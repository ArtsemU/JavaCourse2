package generics;

import java.util.ArrayList;

public class ParametrizedMethod
{
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(0);
        al1.add(11);
        al1.add(22);

        System.out.println(GenMethod.getSecondElement(al1));

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        System.out.println(GenMethod.getSecondElement(al2));
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}



package collection;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("awd");
        arrayList1.add(null);
        arrayList1.add("Maria");
        arrayList1.add(1,"Maria_2");

    for(String s : arrayList1) {
        System.out.println(s);
    }

    // get
    for (int i = 0; i <arrayList1.size();i++){
        System.out.println(arrayList1.get(i));
    }

    // set
    arrayList1.set(2, "SomeName");

        for(String s : arrayList1) {
            System.out.println(s);
        }
        arrayList1.remove(0);


    }
}

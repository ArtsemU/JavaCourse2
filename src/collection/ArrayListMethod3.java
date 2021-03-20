package collection;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        System.out.println(arrayList1);
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Marya");
        arrayList1.add("Zaur");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        System.out.println(arrayList2);

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

//        arrayList1.clear();
//        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Not Exist name"));
        System.out.println(arrayList1.indexOf("!!!"));
    }
}

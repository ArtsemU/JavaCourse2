package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("awd");
        arrayList1.add(null);
        arrayList1.add("Maria");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("spmething");
        arrayList2.add("dsczxc__");

        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);

        System.out.println(arrayList1);
        System.out.println(arrayList4);

    }
}

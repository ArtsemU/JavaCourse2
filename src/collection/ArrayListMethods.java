package collection;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ninok");
        arrayList1.add("Maria");
        arrayList1.add("Olga");
        for (String s: arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();
        arrayList1.add(1, "Miha");
        for (String s: arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println(arrayList1.get(2));

        for (int i = 0; i < arrayList1.size(); i++){
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        arrayList1.set(1, "Mikola");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);


    }
}

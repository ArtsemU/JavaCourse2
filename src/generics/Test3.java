package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    // WildCards = означает сильаня карта
    public static void main(String[] args) {

//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

        List<?> list = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.15);
        list1.add(2.44);
        list1.add(8.72);

        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("awdaw");
        list2.add("cxvxc");
        list2.add("iuiui");
        showListInfo(list2);

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(4.42);
        ald.add(7.47);
        ald.add(8.48);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(4);
        ali.add(7);
        ali.add(8);
        System.out.println(summ(ali));
    }
    static void showListInfo(List<?> list){
        System.out.println("My list has: " + list);
    }

    public static double summ(ArrayList<? extends  Number> list){
        double summ = 0;
        for(Number n : list){
            summ +=n.doubleValue();
        }
        return summ;
    }

}

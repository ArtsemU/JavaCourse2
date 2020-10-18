package generics;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();
        //List<X> list1 = new ArrayList<Y>();
//        List<Number> list1 = new ArrayList<Integer>();
//        list1.add(13);
//        list1.add(1.51);
    }
}

class X{}

class Y extends X{}

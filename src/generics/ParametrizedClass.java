package generics;

public class ParametrizedClass
{
    public static void main(String[] args)
    {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(20);
        System.out.println(info2);

        Info<Double> info3 = new Info<>(22.5);
        System.out.println(info3);



    }
    // Type erasure
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
}
//class Info <T extends Number & I1 & I2>
class Info <T extends Number>
{
    private T value;
    public Info(T value)
    {
        this.value = value;
    }
    public String toString()
    {
        return "{[" + value + "]}";
    }

    public T getValue()
    {
        return value;
    }
}

//class Parent{
//    public void abs(Info<String> info){
//        String s = info.getValue();
//    }
//}

//class Child extends Parent{
//    public void abs(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}

interface I1{}
interface I2{}

package generics;

public class ParametrizedClass
{
    public static void main(String[] args)
    {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(20);
        System.out.println(info2);

    }
}

class Info <T>
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
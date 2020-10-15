package generics;

public class ParametrizedClass2
{
    public static void main(String[] args)
    {
        Pair<String, Boolean> pair1 = new Pair<String, Boolean>("hello", true);
        System.out.println("Pair: First " + pair1.getFirstValue() + " second: " + pair1.getSecondValue());
    }

}

class   Pair <V1, V2>
{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2)
    {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue()
    {
        return value1;
    }
    public V2 getSecondValue()
    {
        return value2;
    }
}

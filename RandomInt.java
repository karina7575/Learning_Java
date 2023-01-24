public class RandomInt
{
    public static void main (String[] args)
    {
        int n = 109;
        double r = Math.random();
        int value = (int)(r*n);

        System.out.println(value);
    }
}

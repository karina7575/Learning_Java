public class PowersOfTwo
{
    public static void main(String[] args)
    {
        int n = 31;
        int power = 1, i = 0;
        while (i<=n)
        {
            System.out.println(i + " " + power);
            power*=2;
            i+=1;
        }
    }
}

public class Binary
{
    public static void main (String[] args)
    {
        int power = 1, n = 19;
        while (power <=n/2) power = 2 * power;
        //теперь power содержит наибольшую степень 2<=n
        while (power > 0)
        {
            if (n < power) {System.out.print(0);}
            else {System.out.print(1); n-=power;}
            power /=2;
        }
        System.out.println();

    }
}

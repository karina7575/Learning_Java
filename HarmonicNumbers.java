public class HarmonicNumbers
{
    public static void main(String[] args)
    {
        int n = 2;
        double sum = 0.0;
        for (int i = 1; i <=n; i++)
        {
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
}

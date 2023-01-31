public class SQRT
{
    public static void main(String[] args)

    {
        double c = 2544545;
        double EPSILON = 1e-15;
        double t=c;
        while (Math.abs(t-c/t) > EPSILON * t)
        {
            //заменить t средним арифметическим t и c/t
            t = (c/t+t)/2.0;
        }
        System.out.println(t);
    }
}

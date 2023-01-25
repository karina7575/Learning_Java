public class excercises
{
    public static void main(String [] args)
    {
    //1.2.22
        double x0 = 3.2, v0 = 5.4, t = 8.21;
        final double g = 9.80665;
        double result = x0 + v0*t + (g*t*t)/2;
        System.out.println(result);
    //1.2.23
        int d = 25, m = 3;
        System.out.println((d >= 20 && m == 3)||((6 >= m)&&(m >= 3))||(d <= 20 && m == 6));
    //1.2.24
        int years = 4, dollars = 435000;
        double procent = 8.7;
        int sum = (int) (dollars * (Math.exp(years*procent)));
        System.out.println(sum);
    //1.2.25
        double temperature = 230, velocity = 65;
        double w;
        w = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow (velocity, 0.16);
        System.out.println(w);
    //1.2.26
        
    }
}

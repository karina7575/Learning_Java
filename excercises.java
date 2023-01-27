public class excercises
{
    public static void main(String [] args)
    {
    //1.2.22
        double x0 = 3.2, v0 = 5.4, t = 8.21;
        final double G = 9.80665;
        double result = x0 + v0*t + (G*t*t)/2;
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
        double yu = 4.2, xu = 54.7, pol1, pol2;


    //1.2.27
        double rand, skor, u;
        final double PI = 3.1415;
        skor = Math.random();
        u = Math.random();
        rand=Math.sin(2.0*PI*skor)*(-2.0*Math.log(u));
        rand = Math.pow(rand, (1.0/2.0));
        System.out.println("1.2.27");
        System.out.println(rand);

    //1.2.28
        double x=54,y=123,z=654;
        System.out.println((x < y && y < z)||(x > y && y > z));
    //1.2.29
        int month, day, year, found, y0, m0, d0;
        day = 1;
        month = 12;
        year = 2012;
        y0 = year-(14-month)/12;
        found = y0+y0/4-y0/100+y0/400;
        m0 = month+12*((14-month)/12)-2;
        d0 = (day+found+(31*m0)/12)%7;
        System.out.println(d0);

    //1.2.30
        double one, two, three, four, five, mini, maxi;
        one = Math.random();
        two = Math.random();
        three = Math.random();
        four = Math.random();
        five = Math.random();
        mini = Math.min (one, two);
        mini = Math.min (mini, three);
        mini = Math.min (mini, four);
        mini = Math.min (mini, five);
        maxi = Math.max (one, two);
        maxi = Math.max (maxi, three);
        maxi = Math.max (maxi, four);
        maxi = Math.max (maxi, five);
        System.out.println(mini);
        System.out.println(maxi);
        System.out.println((one + two + three + four + five)/5);
    //1.2.31
       double shirota = 63.23, dolgota = 12.32, nul = 4.6, res, res1;
        res=dolgota - nul;
        res1 = (1+Math.sin(shirota))/(1-Math.sin(shirota));
        System.out.println("1.2.31");
        System.out.println(res1);
        res1 = Math.log(res1);
        System.out.println(res1);
        res1=(1.0/2.0)*res1;
        System.out.println(res);
        System.out.println(res1);
    //1.2.32
        int ri = 2, gi = 65, bi = 34;
        double wi, ci, mi, yi, ki;
        wi = Math.max((ri / 255.000), (gi / 255.000));
        wi = Math.max(wi, (bi / 255.000));
        ci = (wi - (ri / 255.000)) / wi;
        mi = (wi - (gi / 255.000)) / wi;
        yi = (wi - (bi / 255.000)) / wi;
        ki = 1.0 - wi;
        System.out.println("RGB to CMYK:");
        System.out.println(ci);
        System.out.println(mi);
        System.out.println(yi);
        System.out.println(ki);

    //1.2.33

    //1.2.34
        int a=4,b=6,c=1,i,j,k;
        i = Math.min(a,b);
        i = Math.min(i,c);
        System.out.println(i);
        k = Math.max(a,b);
        k = Math.max(k,c);
        j = (a+b+c)-i-k;
        System.out.println(j);
        System.out.println(k);
    //1.2.35
        int n = 4;
        





    }
}

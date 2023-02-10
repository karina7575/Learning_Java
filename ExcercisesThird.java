import java.util.Scanner;
public class ExcercisesThird
{
    public static void main(String[] args)
    {
        //1.3.1
        System.out.println("1.3.1");
        int a = 4, b = 4, c = 4;
        if (a == b && b == c) System.out.println("equal");
        else System.out.println("not equal");

        //1.3.2
        System.out.println("1.3.2");
        double ai = 6;
        double bi = 33;
        double ci = -7;
        if(ai != 0) {
            double discriminant = bi * bi - 4.0 * ci * ai;
            if (discriminant < 0) {
                System.out.println("no.");
            } else {
                System.out.println(discriminant);
                double d = Math.sqrt(discriminant);
                System.out.println((-bi + d) / (2.0*ai));
                System.out.println((-bi - d) / (2.0*ai));
            }
        }
        else System.out.println("no. a = 0");

        //1.3.4
        System.out.println("1.3.4");
        double x = 0.77, y = 0.5;
        if (0.0 < x && 0.0 < y && 1.0 > x && 1.0 > y)
            System.out.println ("true");
        else System.out.println ("false");

        //1.3.5
        System.out.println("1.3.5");
        int ran = (int) (1 + Math.random() * 8);
        if(ran < 9 && 5 < ran) System.out.println("6");
        else System.out.println(ran);

        //1.3.6
        System.out.println("1.3.5");
        double temperature = 49, velocity = 65;
        double w;
        if(temperature <= 50 && velocity <= 120 && velocity >= 3)
        {
            w = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow (velocity, 0.16);
            System.out.println(w);
        }
        else System.out.println("ERROR");

        //1.3.7
        System.out.println("1.3.7");
        for (int i = 0, j = 0; i < 10; i++)
        {
            j+=++j;
            System.out.println(i + " " + j);
        }

        //1.3.8
        System.out.println("1.3.8");
        int repeats = 5, hellos = 1;
        while (hellos<=repeats)
        {
            if (hellos % 10 == 1 && hellos %100 > 20)
            {
                System.out.println(hellos + "st Hello");
            }
            else if (hellos % 10 == 2 && hellos %100 > 20)
            {
                System.out.println(hellos + "nd Hello");
            }
            else if (hellos % 10 == 3 && hellos %100 > 20)
            {
                System.out.println(hellos + "rd Hello");
            }
            else System.out.println(hellos + "th Hello");
            hellos += 1;
        }

        //1.3.9
        System.out.println("1.3.9");
        for (int i = 1000; i <=2000; i++)
        {
            System.out.print(i + " ");
            if(i % 10 == 4 || i % 10 == 9) System.out.println();
        }

        //1.3.10
        System.out.println("\n1.3.10");
        int ch = 23, mi = 1;
        double ni, mid = 0.0;
        while(mi < ch)
        {
            ni = Math.random();
            mi++;
            mid += ni;
            System.out.println(ni + ", ");
        }
        mid = mid/(double)ch;
        System.out.print("Среднее значение = " + mid);

        //1.3.12
        System.out.println("\n1.3.12");
        double nr = 2.0;
        String str;
        while (nr <=2048.0)
        {
            str = String.format("%.2f", Math.log(nr));
            System.out.print(str);
            str = String.format("%.2f ", nr);
            System.out.print("\t\t" + str);
            str = String.format("%.2f", (nr*(Math.log(nr))));
            System.out.print("\t\t" + str);
            str = String.format("%.2f", (Math.pow(nr, 2.0)));
            System.out.print("\t\t" + str);
            str = String.format("%.2f", (Math.pow(nr, 3.0)));
            System.out.print("\t\t" + str);
            str = String.format("%.2f", (Math.pow(2.0, nr)));
            System.out.print("\t\t" + str);
            nr *= 2;
            System.out.println();
        }

        //1.3.13
        System.out.println("\n1.3.13");
        int ng = 123456789, mg = 0;
        while (ng != 0)
        {
            mg = (10*mg) + (ng%10);
            ng = ng / 10;
            System.out.println (ng + " " + mg);
        }
        //1.3.14 Числа Фибоначчи
        System.out.println("1.3.14");
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++)
        {
            System.out.println (f);
            f = f + g;
            g = f - g;
        }

        //1.3.16
        System.out.println("1.3.16");
        int bt = 2;
        Scanner in = new Scanner(System.in);
        int nt = in.nextInt();
        in.close();
        while (bt<=nt)
        {
            System.out.println(bt);
            bt *= 2;
        }

        //1.3.17
        System.out.println("1.3.17");
        int years = 4, months;
        double dollars = 435.0;
        double procent = 8.7;
        //int sum = (int) (dollars * (Math.exp(years*procent)));
        //System.out.println(sum);
        months = years * 12;
        for(int i = 1; i <= months; i++){
            int sum = (int) (dollars + (dollars*procent*0.01));
            dollars = sum;
            System.out.println(sum);
        }

        //1.3.21
        //System.out.println("1.3.21");
        //int power = 1, n = 19;
        //while (power <=n/2) power = 2 * power;
        //теперь power содержит наибольшую степень 2<=n
        //while (power > 0)
        //{
        //    if (n < power) {System.out.print(0);}
        //    else {System.out.print(1); n-=power;}
        //    power /=2;
        //}
        //System.out.println();
        //while(n % 16 > 0)
        //{
        //    if ()
        //}

        //1.3.23
        System.out.println("1.3.23");
        

    }
}

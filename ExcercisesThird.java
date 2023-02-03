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
        System.out.println("1.3.10");
        int ch = 23, mi = 1;
        double ni;
        while(mi < ch)
        {
            ni = Math.random();
            mi++;
        }


    }
}

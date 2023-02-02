public class excercises1_3
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
    }
}

public class excercise {
    public static void main(String[] args) {
        double f = -87;
        double sinus = Math.sin(f);
        double cosinus = Math.cos(f);

        System.out.println(sinus * sinus + cosinus * cosinus);
        System.out.println((2 + 3) + "bc");
        System.out.println("bc" + 2 + 3);
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));

        double a = 3.14159;
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println(8 / (int) a);
        System.out.println(8 / a);
        System.out.println((int) (8 / a));

        boolean result;
        result = (Math.sqrt(2) * Math.sqrt(2) == 2);
        System.out.println(result);
        System.out.println(Math.sqrt(2) * Math.sqrt(2));

        int c = 10, b = 145;
        System.out.println(c % b == 0 || b % c == 0);

        int w = 1, q = 2, r = 3;
        System.out.println(q < w + r && w < q + r && r < q + w);

        double x = 1.2;
        double y = 3.5;
        System.out.println(Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0)));
    //1.2.19
        int t = 6, u = 9;
        int ran = (int) (t + Math.random() * (u - t));
        System.out.println(ran);
    //1.2.20
        int cube1, cube2;
        cube1 = (int) (1 + Math.random() * 5);
        cube2 = (int) (1 + Math.random() * 5);
        System.out.print("Sum cubes: ");
        System.out.println(cube1 + cube2);
    //1.2.21
        int numb = 8;
        float resu1 = (float) (Math.sin(2 * numb));
        double resu2 = (Math.sin(3 * numb));
        System.out.println(resu1);
        System.out.println(resu2);
    }
}
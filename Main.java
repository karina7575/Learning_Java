import javax.swing.*;
public class Main {
    public static void main(String[] args)
    {
        int a = 1234;
        int b = 99;
        int p = a*b;
        int q = a/b;
        int r = a%b;
        System.out.println(a + "*" + b + "=" + p);
        System.out.println(a + "/" + b + "=" + q);
        System.out.println(a + "%" + b + "=" + r);
        System.out.println(a + "=" + q + "*" + b + "+" + r);
    }
}

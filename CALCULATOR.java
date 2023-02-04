public class CALCULATOR
{
    public static void main(String [] args)
    {
        int a,b;
        String str1 = "32+54";
        if (str1.indexOf(43) != -1)
        {
            String[] strings = str1.split("\\+");
            a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a+b);
        }
        else if (str1.indexOf(45) != -1)
        {
            String[] strings = str1.split("\\-");
            a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a-b);
        }
        else if (str1.indexOf(42) != -1)
        {
            String[] strings = str1.split("\\*");
            a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a*b);
        }
        else if (str1.indexOf(47) != -1)
        {
        String[] strings = str1.split("\\/");
        a = Integer.parseInt (strings[0]);
        b = Integer.parseInt (strings[1]);
        System.out.println(a/b);
        }

    }
}

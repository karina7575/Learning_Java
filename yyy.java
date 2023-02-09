public class yyy
{
        public static void main(String[] args) {
            int a, b, result;
            String[] strings = new String[3];
            String str1 = "1+5";
            System.out.println(str1);
            System.out.println(strings[0]);
            System.out.println(strings[1]);
            System.out.println(strings[2]);

            if (str1.indexOf(43) != -1) {
                strings = str1.split("\\+", 0);

                if ((strings.length) > 2) System.out.print("yeah");
            }
        }

}

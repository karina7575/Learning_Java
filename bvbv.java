public class bvbv
{
    public static void main(String [] args) {
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
    }
}

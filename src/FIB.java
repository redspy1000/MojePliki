import java.util.Scanner;

public class FIB {
    public static Double FIB(int n) {
        double potenga = n;
        double f = 1 / Math.sqrt(5.0) * Math.pow((1 + Math.sqrt(5.0) / 2), potenga) - 1 / Math.sqrt(5.0) * Math.pow((1 - Math.sqrt(5.0) / 2), potenga);

        return f;
    }

    public static String wypisz() {

        for (int i = 1; i < 4; i++) {
            int n=5;
            if(i==2) {
             n=10;

            }
            if(i==3) {
                n=15;

            }

            System.out.println("f" + i + "=" + FIB(n));

        }

        return " ";
    }

    public static double Bravo(int f) {

        double x = (FIB(f)*FIB(f)-3*FIB(f)+2)/(FIB(f)-2);

        return x;
    }

    public static double Gamma(int x) {

        double ex = Math.exp(Bravo(x));
        double y = (ex*Math.sin(Bravo(x))+(2*Math.cos(Math.pow(Bravo(x),2)))+5)/Math.log(Bravo(x));
                return y;
    }

    public static void main(String[] args) {
        System.out.println(Gamma(5));
        System.out.println(Gamma(10));
        System.out.println(Gamma(15));
    }
}

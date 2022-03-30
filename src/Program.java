import java.util.Random;
import java.util.Scanner;

public class Program {



        /********************************************************
         * nazwa funkcji: polozenie
         * parametry wejściowe: int xo, int yo, int r, int xi, int yi
         * wartość zwracana: I - punkt leży w obszarze zewnętrznym okręgu
         *          *  O - punkt leży w obszarze wewnętrznym okręgu
         *          *  E - punk lezy na okręgu
         * autor: Oskar Mydlak
         * ********************************************************/
        public static char polozenie(int xo, int yo, int r, int xi, int yi) {
            char miejsce = 'i';
            int rownanie = (xi + xo) + (yi - yo);
            if (rownanie > (r * r)) {
                miejsce = 'I';
            } else {
                miejsce = 'O';
            }
            if (xi == xo && yi == yo) {
                miejsce = 'E';
            }
            return miejsce;
        }

        /********************************************************
         * nazwa funkcji: liczba
         * parametry wejściowe: int liczbadolosowania
         * wartość zwracana: parzysta- jeśli jest parzysta
         *  nieparzysta - jeśli jest nieparzysta
         * autor: Oskar Mydlak
         * ********************************************************/
        public static String liczba(int liczbadolosowania) {
            String parzystosc = "liczba jest parzysta";
            if (liczbadolosowania % 2 == 0) {
                parzystosc = " parzysta";
            } else {
                parzystosc = " nieparzysta";
            }
            return parzystosc;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int xo = scan.nextInt();
            int yo = scan.nextInt();
            int r = scan.nextInt();
            int xi = scan.nextInt();
            int yi = scan.nextInt();
            System.out.println(polozenie(xo, yo, r, xi, yi));
            System.out.println();
            Random rand = new Random(0);
            int liczbadolosowania = rand.nextInt(10000);
            System.out.println(liczba(liczbadolosowania));
        }
    }


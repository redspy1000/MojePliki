import java.util.Locale;
/********************************************************
 * nazwa funkcji: palindrom
 * parametry wejściowe: string wyraz
 * wartość zwracana: true-liczba jest palindromem
 *                   false-liczba nie jest palindromem
 * autor: Oskar Mydlak
 * ********************************************************/
public class Palindrom {
    public static boolean isPalindrom(String wyraz) {
        String wyrazlow = wyraz.toLowerCase(Locale.ROOT);
        String wyrazprep = wyrazlow.trim();
          int length = wyrazprep.length();
          boolean truth=true;
        char[] wyrazback = wyrazprep.toCharArray();
        for(int i =0;i<length;i++) {

            int backlength = (length-1)-i;
            if(wyrazback[i]==wyrazback[backlength]) {
                truth=true;
            } else {
                truth=false;
            break;
            }
        }

        return truth;
    }
    /********************************************************
     * nazwa funkcji: przestaw
     * parametry wejściowe: string przes
     * wartość zwracana: przestawiony string przes
     *
     * autor: Oskar Mydlak
     * ********************************************************/
    public static String Przestaw(String przes) {
              int length = przes.length();
              char[] przestab =przes.toCharArray();
             String przestawienie="test";
              for(int i=0;i<length-1;i++) {


                      if (i % 2 == 1 ||i>0) {
                          przestawienie = przes.replace(przestab[i+1], przestab[i - i]);
                      }
                      else{
                          przestawienie = przes.replace(przestab[i+1], przestab[i]);
                      }
                  }

        return przestawienie;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("aa bb"));
        System.out.println(Przestaw("abc"));
    }
}

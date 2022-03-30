/********************************************************
 * nazwa funkcji: NewPassword
 * parametry wejściowe: int dl
 * wartość zwracana: wygenerowane hasło
 *
 * autor: Oskar Mydlak
 * ********************************************************/
import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static String NewPassword(int dl) {
        String password="";
        Random rand = new Random();
        if(dl>=12) {
            for(int i=0;i<dl;i++){
                int Ascii = rand.nextInt(33,126);
                char letter = (char) Ascii;
                password += letter;
            }
        }
        else {
            password="za krótka długość, minimalna długość to 12 znaków";
        }
        return password;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("proszę podać długość hasła: ");
        int dl=scan.nextInt();
        System.out.println(NewPassword(dl));
    }
}

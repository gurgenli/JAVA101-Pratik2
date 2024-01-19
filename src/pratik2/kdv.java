package pratik2;

import java.util.Scanner;


public class kdv {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Tutarı giriniz: ");
        double kdvsiz = inp.nextDouble();

        System.out.println("KDV'li Tutar: " +kdvsiz +" TL");
        double kdvli = (kdvsiz*1.18);

        System.out.println("KDV'siz Tutar: " +kdvli +" TL");
        System.out.println("KDV Tutarı:%18'dir.");



    }
}

package pratik1;

import java.util.Scanner;


public class kdv {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdvsiz, kdvli, kdvTutari;


        System.out.print("Lütfen Tutarı giriniz: ");
        kdvsiz = inp.nextDouble();

        System.out.println("KDV'siz Tutar: " +kdvsiz +" TL");

        kdvli = (kdvsiz*1.18);
        kdvTutari = kdvsiz*0.18;
        System.out.println("KDV Tutarı: " +kdvTutari +" TL");
        System.out.println("KDV'li Tutar: " +kdvli +" TL");
        System.out.println("KDV %18'dir.");



    }
}

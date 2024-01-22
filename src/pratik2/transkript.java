import java.util.Scanner;


public class transkript {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (mat>100) {mat=0;}
        if (fizik>100) {fizik=0;}
        if (kimya>100) {kimya=0;}
        if (turkce>100) {turkce=0;}
        if (muzik>100) {muzik=0;}

        double ort = ((mat+fizik+turkce+kimya+muzik)/5);

        if (ort > 55){
            System.out.println("Sınıfı Geçtiniz");
        }else {
            System.out.println("Sınıfta Kaldınız Lütfen tekrar deneyiniz");
        }

        System.out.println("Not Ortalamanız: " +ort);


    }
}

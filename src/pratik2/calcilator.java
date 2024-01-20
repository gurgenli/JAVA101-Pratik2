import java.util.Scanner;

public class calcilator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("Yapmak istediğiniz dört işlemi belirtin: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        double islem = input.nextDouble();
        System.out.println(("1'inci sayıyı giriniz: "));
        a = input.nextDouble();
        System.out.println(("2'nci sayıyı giriniz: "));
        b = input.nextDouble();

        if (islem == 1) {
            System.out.println("Sonuç= " + (a + b));
        } else if (islem == 2) {
            System.out.println("Sonuç= " + (a - b));
        } else if (islem == 3) {
            System.out.println("Sonuç= " + (a * b));
        } else if (islem == 4) {
            System.out.println("Sonuç= " + (a / b));
            if (b == 0) {
                System.out.println("Sıfır bölünmez = Tanımsız!");
            }
        } else {
            System.out.println("HATA!");


        }


    }
}
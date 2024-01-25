package pratik3;
import java.util.Scanner;
public class bastop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        int kalan;
        int sonuc=0;
        System.out.println("Sayı Gir= ");
        number = inp.nextInt();
        while(number!=0){
            kalan =number %10;
            sonuc += kalan;
            number /= 10;
        }
        System.out.println("Basamakları Toplamı= "+sonuc);
    }
}

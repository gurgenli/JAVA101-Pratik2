package pratik3;
import java.sql.SQLOutput;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, xn;
        System.out.print("Kaç sayı gireceksiniz: ");
        n = input.nextInt();
        while (n>0){
            System.out.print("Sayı giriniz: ");
            xn = input.nextInt();
            --n;
        }




    }
}

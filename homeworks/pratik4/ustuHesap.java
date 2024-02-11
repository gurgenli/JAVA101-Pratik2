package pratik4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ustuHesap {

    static int us(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.print("Taban Değerini Giriniz: ");
        a = inp.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        b = inp.nextInt();

        System.out.println(a +" üstü " +b +" = " +us(a,b));

    }
}

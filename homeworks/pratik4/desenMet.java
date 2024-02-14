package pratik4;
import java.util.Scanner;

public class desenMet {

    static void met(int a){
        if ( a >= 0){
            System.out.print(a + " ");
            met(a-5);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a= input.nextInt();
        met(a);
    }
}

package pratik4;
import java.util.Scanner;
import java.util.Stack;

public class desenMetot {
    static void metot(int a){
        if(a>0){
            System.out.print(a +" ");
            metot(a-5);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        a = inp.nextInt();
        metot(a);
    }
}

package pratik3;
import java.util.Scanner;

public class karesi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Sayı Gir: ");
        num = input.nextInt();
        System.out.println("4'ün Katları: ");
        for (int i=1;num>=i; i *= 4){
            System.out.print(i +" ");
        }
        System.out.print("5'in Katları: ");
        for (int i=1;num>=i; i *= 5){
            System.out.println(i);
        }

    }
}

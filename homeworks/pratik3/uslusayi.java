package pratik3;
import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int c, r;
        System.out.println("Sayı Gir= ");
        c= inp.nextInt();
        System.out.println("Sayı Gir= ");
        r= inp.nextInt();
        int total=1;
        for(int i=1; i<=r; i++){
            total *= c;
        }
        System.out.println("Total= " +total);

    }
}

package pratik3;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int x=0, z=1;
        System.out.println("Bir Sayı Giriniz: ");
        n = input.nextInt();
        while (x<=n){
            x += z;
            System.out.println(z);
        }
    }
}

package pratik3;
import java.sql.SQLOutput;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, xn;
        System.out.print("Kaç sayı gireceksiniz: ");
        n = input.nextInt();
        xn=1;

        while (n>=1){
            System.out.print("Sayı giriniz: ");
            xn = input.nextInt();
            n--;
        }
        for(int i=1; i<=xn; i++){
            System.out.println("En küçük sayı:" +xn);
            break;
        }

    }


}

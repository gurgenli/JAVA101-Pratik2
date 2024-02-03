package pratik3;
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Gir: ");
        int n= inp.nextInt();
        int total=0;

        for(int i=1; i<=n; i++){
            if(n %i ==0){
                total += i;
            }
        }
        if((total-n)==n){
            System.out.println(n + " sayısı Mükemmel Sayıdır.");
        }else {
            System.out.println(n +" sayısı Mükemmel Sayı Değildir!");
        }

    }
}

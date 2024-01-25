package pratik3;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number, basdeg=0;
        System.out.print("Sayı   Gir= ");
        number = input.nextInt();
        int tempNumber=number;
        int kalan;
        int ust;
        int sonuc=0;

        while(tempNumber!=0){
            tempNumber /= 10;
            basdeg++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            kalan = tempNumber %10;
            ust=1;
            for(int i=1; i<=basdeg; i++){
                ust *= kalan;
            }
            tempNumber /= 10;
            sonuc += ust;

        }
        System.out.println(sonuc);

    }
}

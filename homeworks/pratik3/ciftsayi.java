import java.util.Scanner;

public class ciftsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz: ");
        sayi = input.nextInt();
        for(int i=1; sayi>=i; i++){
            if(i %2 ==0){
                System.out.println(i);
            }
        }

        System.out.println("-------------");

        int k, i=1;
        System.out.println("Sayı Gir: ");
        k=input.nextInt();

        while (k>=i) {
            if (i %2 == 0){
                System.out.println(i);
            }
            i++;
        }



    }
}



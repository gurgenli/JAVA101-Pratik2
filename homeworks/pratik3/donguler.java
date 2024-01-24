import java.util.Scanner;

public class donguler {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi, i=1;
        System.out.println("Sayı gir:");
        sayi = input.nextInt();
        while (sayi>=i) {
            if(i %2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

}




import java.util.Scanner;

public class teksayitop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int total=0;

        do {
            System.out.println("Sayı Gir: ");
            num =input.nextInt();
            if (num %2 == 1){
                total += num;

            }
        } while (num>0);
        System.out.println("Toplam: " +total);

    }
}

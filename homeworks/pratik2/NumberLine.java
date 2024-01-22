import java.util.Scanner;


public class NumberLine {
    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen 3 sayı giriniz.");
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        num3 = inp.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.print("Büyükten Küçüğe Sayılar:" + num1 + num2 + num3);
            } else {
                System.out.print("Büyükten Küçüğe Sayılar:" + num1 + num3 + num2);
            }
        }
        else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.print("Büyükten Küçüğe Sayılar:" + num2 + num1 + num3);
            } else {
                System.out.print("Büyükten Küçüğe Sayılar:" + num2 + num3 + num1);
            }
        }
        else {
            System.out.print("Büyükten Küçüğe Sayılar:" + num3 + num2 + num1);
        }

    }
}
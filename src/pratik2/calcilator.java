import java.sql.SQLOutput;
import java.util.Scanner;

public class calcilator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Yapmak istediğiniz dört işlemi belirtin: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int islem = input.nextInt();
        System.out.println(("1'inci sayıyı giriniz: "));
        a = input.nextInt();
        System.out.println(("2'nci sayıyı giriniz: "));
        b = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Sıfıra bölüm olmaz!");
                }
                System.out.println(a/b);
                break;
        }
        }


    }
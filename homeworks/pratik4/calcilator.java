package pratik4;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;
public class calcilator {
    static int plus (int a, int b){
        int result = a+b;
        System.out.println(result);
        return result;
    }
    static int minus (int a, int b){
        int result = a-b;
        System.out.println(result);
        return result;
    }
    static int times (int a, int b){
        int result= a*b;
        System.out.println(result);
        return result;
    }
    static int divide (int a, int b){
        if (b==0){
            return 0;
        }
        int result =a/b;
        System.out.println(result);
        return result;
    }
    static int us(int a, int b){
        int result = 1;
        for(int i=1; i<=b; i++){
            result *= a;
        }
        System.out.println(result);
        return result;
    }
    static int fac (int a){
        int result=1;
        for(int i=1; i<=a; i++){
            result *= i;
        }
        System.out.println(result);
        return result;
    }
    static int mod (int a, int b){
        int result;
        result = a %b;
        System.out.println(result);
        return result;
    }

    static void dikdort(int a,int b){
        int cevre = 2*(a+b);
        int alan = a*b;
        System.out.println("Çevre: " +cevre);
        System.out.println("Alan: " +alan);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        int a, b;
        String menu = "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Üst Alma\n" +
                "6-Faktoriyel Alma\n" +
                "7-Mod Alma\n" +
                "8-Dikdörgen Alan ve Çevresi\n" +
                "0-Çık";

        while (true){
            System.out.println("Yapmak İstediğiniz İşlem:\n" +menu);
            select = inp.nextInt();


            if(select ==0){
                break;
            }
            System.out.print("Birinci Sayı: ");
            a = inp.nextInt();
            System.out.print("İkinci Sayı: ");
            b = inp.nextInt();

            switch (select){
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if(divide(a,b)==0){
                        System.out.println("HATA");
                    }else {
                        divide(a,b);
                    }
                    break;
                case 5:
                    us(a,b);
                    break;
                case 6:
                    fac(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    dikdort(a,b);
                    break;


                default:
                    System.out.println("Geçersiz!");

            }
        }
    }
}

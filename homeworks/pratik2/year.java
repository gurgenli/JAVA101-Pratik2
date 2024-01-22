import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year;
        System.out.println("Yıl Giriniz: ");
        year= input.nextInt();

        if (year %4 ==0 ){
            System.out.println(+year +" Artık Yıldır!");
            }else {
            System.out.println(+year +" Artık Yıl Değildir!");
        }
        }

    }

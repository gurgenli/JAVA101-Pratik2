import java.util.Scanner;

public class study2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir rakam gir: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            default:
                System.out.printf("BİTTİ");
        }

        }

    }


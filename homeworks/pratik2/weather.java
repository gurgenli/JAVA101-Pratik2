import java.util.Scanner;


public class weather {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int heat;
        System.out.println("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat <=15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }if (heat >= 10){
                System.out.print("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}

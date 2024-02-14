package pratik4;
import java.util.Scanner;
public class asalSayi {

    static boolean us(int a){
        for(int i=2; i<a; i++){
            if(a %i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Gir: ");
        int a= inp.nextInt();

        if(us(a)==true){
            System.out.println( a +" Asal Sayıdır");
        }else {
            System.out.println(a +" Asal Sayı Değildir");
        }

    }
}

package pratik4;
import java.util.Scanner;

public class asal {
    static boolean asal(int a){
        for(int i=2; i<a; i++){
            if (a %i ==0){
                return false;
            }
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Bir Sayı Gir: ");
        a = inp.nextInt();
        if(asal(a)){
            System.out.println("Asal Sayıdır");
        }else {
            System.out.println("Asal Sayı Değildir");
        }
    }
}

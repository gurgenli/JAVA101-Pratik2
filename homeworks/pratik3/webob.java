package pratik3;
import java.util.Scanner;
public class webob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Sayı Giriniz: ");
        int n2 = input.nextInt();
        int ebob=1;

        for(int i=1; i<=(n1*n2); i++){
            if(i %n1 == 0 && i %n2 ==0){
                System.out.println(i);
                break;
            }
        }
    }
}

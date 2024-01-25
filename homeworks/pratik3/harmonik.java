package pratik3;
import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        double result=0.0;

        System.out.println("Sayı Gir= ");
        number= inp.nextInt();;

        for(double i=1; i<=number; i++){
            result += (1/i);
        }
        System.out.print("Harmonik Seri= " +result);
    }
}

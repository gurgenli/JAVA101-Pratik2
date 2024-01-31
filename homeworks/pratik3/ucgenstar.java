package pratik3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ucgenstar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        System.out.println("Sayı Gir: ");
        n =input.nextInt();

        for(int i=1; i<=n; n--){
            System.out.println();
            for(k=1; k<=((2*n)-1); k++){
                System.out.print("*");
            }
        }
    }
}

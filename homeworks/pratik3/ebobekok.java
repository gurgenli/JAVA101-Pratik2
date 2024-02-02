package pratik3;
import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int n2 = input.nextInt();
        int ebob=1, ekok=1;

        System.out.println("-----------");
        for(int k=n1; k>=1; k--){
            if(n1 %k ==0 && n2 %k == 0){
                ebob=k;
                System.out.println(ebob);
                break;
            }
        }

        System.out.println("-----------");
        for(int j=1; j<=(n1*n2); j++){
            if(j %n1 ==0 && j %n2 ==0){
                ekok=j;
                break;
            }
        }
        System.out.println(ekok);




        /*

        for(int i=1; i<=n1; i++){
            if(n1 %i == 0 && n2 %i == 0){
                ebob=i;
            }
        }
        System.out.println(ebob);


         */

    }


}

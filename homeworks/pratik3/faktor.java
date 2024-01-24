package pratik3;
import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r;
        int nfak=1, rfak=1, nrfak=1;
        System.out.println("Kümenin Eleman Sayısı= ");
        n = inp.nextInt();
        System.out.println("Alt Kümenin Eleman Sayısı= ");
        r = inp.nextInt();
        for(int i=1; i<=n; i++){
            nfak *= i;
        }
        for(int i=1; i<=r; i++){
            rfak *= i;
        }
        for(int i=1; i<=(n-r); i++){
            nrfak *= i;
        }
        System.out.println("C("+n +"," +r +")=" +nfak/(rfak*nrfak));
    }
}

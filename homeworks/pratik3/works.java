import java.util.Scanner;

public class works {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int total=0;
        k= input.nextInt();
        for(int i=1; i<=k; i++){
            if (i %3 ==0 && i %4 ==0){
                total += i;
            }
        }
        System.out.println(total);
    }
}

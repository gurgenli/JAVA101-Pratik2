package pratik3;
import  java.util.Scanner;
public class asalNumber {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            for(int j=2; j<i; j++){
                if(i %j == 0){
                    System.out.println(i);
                }
            }
        }
    }
}

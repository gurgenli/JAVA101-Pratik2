package pratik1;

import java.util.Scanner;


public class taksisayac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, tutar, startPrice=10;

        System.out.print("Taksi kaç km mesafe gitmiştir: ");
        km = input.nextDouble();

        tutar = km*2.20+ startPrice;
        double enaz = tutar >= 20 ? (tutar):(20);
        System.out.print("Tutar: " +enaz +"TL");


    }
}

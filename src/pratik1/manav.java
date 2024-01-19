import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armt, elma, domat, muz, patl;

        System.out.print("Armut kaç kg: ");
        armt=input.nextDouble();

        System.out.print("Elma kaç kg: ");
        elma=input.nextDouble();

        System.out.print("Domates kaç kg: ");
        domat=input.nextDouble();

        System.out.print("Muz kaç kg: ");
        muz=input.nextDouble();

        System.out.print("Patlıcan kaç kg: ");
        patl=input.nextDouble();

        double total= (armt*2.14)+(elma*3.67)+(domat*1.11)+(muz*0.95)+(patl*5);
        System.out.print("Toplam Tutar: " +total +" TL");

    }
}

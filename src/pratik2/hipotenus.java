

package pratik2;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        double a,b,c;

        System.out.print("1'inci Kenarı Giriniz: ");
        a = girdi.nextDouble();
        System.out.print("2'nci Kenarı Giriniz: ");
        b = girdi.nextDouble();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: " +c);


    }
}

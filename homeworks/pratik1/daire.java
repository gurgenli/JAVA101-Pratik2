import java.util.Scanner;

public class daire {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double r, aci, alan, cevre, pi=3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Üçgenin Alanı: " +alan);
        System.out.println("Üçgenin Çevresi: " +cevre);

        System.out.print("Merkez Açı değerini giriniz: ");
        aci=input.nextDouble();
        alan=(pi*(r*r)*aci)/360;
        System.out.print("Daire diliminin alanı: " +alan);

    }
}

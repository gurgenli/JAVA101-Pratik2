import java.util.Scanner;

public class airway {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int mesafe, tip, yas;
            double tutar,yasind,giddönind,indtutar,toplam = 0;
        System.out.print("Mesafe gir: ");
        mesafe = input.nextInt();
        System.out.print("Yaş gir: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipi gir\n1-Tek Yön\n2-Gidiş-Dönüş");
        tip = input.nextInt();

        tutar= mesafe*0.10;

        switch (tip) {
            case 1 :
                if(yas>0 && yas<12) {
                    yasind=tutar*0.50;
                    toplam=tutar-yasind;
                } else if (yas>=12 && yas<25) {
                    yasind=tutar*0.10;
                    toplam=tutar-yasind;
                } else if (yas>65) {
                    yasind=tutar*0.30;
                    toplam=tutar-yasind;
                }else {
                    toplam=tutar;
                }
                break;
            case 2:
                if(yas>0 && yas<12) {
                    yasind=tutar*0.50;
                    indtutar=tutar-yasind;
                    giddönind=indtutar*0.20;
                    toplam=(indtutar-giddönind)*2;
                } else if (yas>=12 && yas<25) {
                    yasind=tutar*0.10;
                    indtutar=tutar-yasind;
                    giddönind=indtutar*0.20;
                    toplam=(indtutar-giddönind)*2;
                } else if (yas>65) {
                    yasind=tutar*0.30;
                    indtutar=tutar-yasind;
                    giddönind=indtutar*0.20;
                    toplam=(indtutar-giddönind)*2;
                }else {
                    indtutar=tutar*0.20;
                    toplam=indtutar*2;
                }
                break;
            default:
                System.out.println("Hatalı işlem yaptınız!");

        }

        System.out.println("Toplam Tutar: " + toplam);


    }
    }


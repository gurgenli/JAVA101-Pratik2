package pratik3;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right=3, select;
        int bakiye=1500;
        while (right>0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if(userName.equals("gürkan") && password.equals("123asd")){
                System.out.println("Hoş Geldiniz");
                System.out.println("-------------");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4 Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçin: ");
                    select = input.nextInt();
                    if (select==1){
                        System.out.print("Yatırılacak Para Miktarı: ");
                        int yatir = input.nextInt();
                        bakiye += yatir;
                    }else if (select==2){
                        System.out.print("Çekilecek Para Miktarı: ");
                        int cek= input.nextInt();
                        if(cek>bakiye){
                            System.out.println("Bakiye yetersiz! Tekrar İşlem Yapınız");
                        }else {
                            bakiye -= cek;
                        }
                    } else if (select==3) {
                        System.out.println("Bakiye= " +bakiye + " TL");
                    } else if(select>4){
                        System.out.println("Hatalı Tuşlama Yaptınız! Tekrar Deneyiniz");
                    }
                } while (select !=4);
                break;
            }else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı yada Şifre!");
                if(right!=0){
                    System.out.println("Kalan Hakkınız: " + right);
                }else {
                    System.out.println("Hesabınız Bloke Olmuştur!");
                }
            }
        }

    }
}

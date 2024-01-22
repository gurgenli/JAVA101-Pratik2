import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int answer;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.printf("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("java") && password.equals("123456")) {
            System.out.println("Hoş geldiniz");
        } else {
            System.out.println("Hatalı giriş yaptınız.");
            System.out.println("1-Şifremi sıfırlamak istiyorum?\n2-Şifre sıfırlamak istemiyorum.");
            answer = input.nextInt();
            if (answer == 1) {
                System.out.println("Lütfen yeni şifre giriniz: ");
                Scanner input2 = new Scanner(System.in);
                newPassword = input2.nextLine();
                if (newPassword.equals("123456")) {
                    System.out.println("Eski şifreniz ile aynı\nLütfen yeni şifre giriniz: ");
                    newPassword = input2.nextLine();
                } else {
                    System.out.println("Şifreniz yenilendi");
                }
            } else if (answer == 2) {
                System.out.println("Şifreniz Değistirilmedi");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }

        }
    }

}

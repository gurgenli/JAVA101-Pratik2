package pratik2;
import java.util.Scanner;
public class study {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int day, month;
        String burc ="";
        boolean inError=false;
        System.out.println("Ay: ");
        month = inp.nextInt();
        System.out.println("Gün: ");
        day = inp.nextInt();

        switch (month) {
            case 1:
                if(day >= 1 && day <= 31) {
                    if(day< 22){
                        burc="Kova";
                    }else {
                        burc="Koç";
                    }
                }else{
                    inError = true;
                }
                break;

            case 2:
                if(day >= 1 && day <= 28) {
                    if(day< 22){
                        burc="Hada";
                    }else {
                        burc="acda";
                    }
                }else{
                    inError = true;
                }
                break;

            default:
                inError = true;
        }

        if(inError){
            System.out.println("Hatalı");
        }else {
            System.out.println("Burcunuz: " +burc);
        }

    }
}

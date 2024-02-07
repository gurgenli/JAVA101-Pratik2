package pratik4;

public class polindrom {
    static boolean inPolindrom (int number){
        int temp = number, lastNumber, reserveNumber=0;

        while (temp>0) {
            lastNumber = temp % 10;
            reserveNumber = (reserveNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number==reserveNumber){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(inPolindrom(101));

    }
}

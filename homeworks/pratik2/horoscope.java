import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;
        boolean isError = false;
        String horoscope="";
        System.out.print("Doğduğunuz günü yazınız: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz ayı yazınız: ");
        month = input.nextInt();

        switch (month){
            case 1 :
                if (day>1 && day<=31) {
                    if (day<22) {
                        horoscope = "Oğlak";
                    }else {
                        horoscope = "Kova";
                    }

                }else {
                    isError = true;
                }
                break;
            case 2 :
                if (day>1 && day<=28) {
                    if (day<20) {
                        horoscope = "Kova";
                    }else {
                        horoscope = "Balık";
                    }

                }else {
                    isError = true;
                }
                break;
            case 3 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Balık";
                    }else {
                        horoscope = "Koç";
                    }

                }else {
                    isError = true;
                }
                break;
            case 4 :
                if (day>1 && day<=30) {
                    if (day<20) {
                        horoscope = "Koç";
                    }else {
                        horoscope = "Boğa";
                    }

                }else {
                    isError = true;
                }
                break;
            case 5 :
                if (day>1 && day<=21) {
                    if (day<20) {
                        horoscope = "Boğa";
                    }else {
                        horoscope = "İkizler";
                    }

                }else {
                    isError = true;
                }
                break;
            case 6 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "İkizler";
                    }else {
                        horoscope = "Yengeç";
                    }

                }else {
                    isError = true;
                }
                break;
            case 7 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Yengeç";
                    }else {
                        horoscope = "Aslan";
                    }

                }else {
                    isError = true;
                }
                break;
            case 8 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Aslan";
                    }else {
                        horoscope = "Başak";
                    }

                }else {
                    isError = true;
                }
                break;
            case 9 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Başak";
                    }else {
                        horoscope = "Terazi";
                    }

                }else {
                    isError = true;
                }
                break;
            case 10 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Terazi";
                    }else {
                        horoscope = "Akrep";
                    }

                }else {
                    isError = true;
                }
                break;
            case 11 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Akrep";
                    }else {
                        horoscope = "Yay";
                    }

                }else {
                    isError = true;
                }
                break;
            case 12 :
                if (day>1 && day<=31) {
                    if (day<20) {
                        horoscope = "Yay";
                    }else {
                        horoscope = "Oğlak";
                    }

                }else {
                    isError = true;
                }
                break;

        }

        System.out.println("Merhaba Burcunuz: " +horoscope);






    }
}

package applications.bodyMass.bodyMassService;

import java.util.Scanner;

public class BodyMassServiceTurkce implements BodyMassService{


    static Scanner scanner = new Scanner(System.in);
    @Override
    public void welcomeMessagge() {
        System.out.println("Dünya Sağlık Örgütü (WHO) vücut kitle indeksine gore kutle endeksi programina hosgeldiniz");

    }

    @Override
    public void bodyMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin 'E' \nKadin icin 'K'\n" +
                "Cinsiyet belirtmemek icin 'x' tuslayiniz");
        String gender = scanner.next();
        System.out.println("Lutfen boyunuzu santimetre olarak giriniz (165, 156 seklinde) ");
        double size = scanner.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double weight = scanner.nextDouble();

        double massIndex = (weight / ((size/100) * (size/100)));
        double idealWeightMale= 50 +2.3 * ((size / 2.54) -60);
        double idealWeightwoman = 45 +2.3 * ((size / 2.54) -60);
        double idealWeight= 48 +2.3 * ((size / 2.54) -60);
        if(gender.substring(0,1).equalsIgnoreCase("K")){
            System.out.println(" idel kilonuz = "+idealWeightwoman);
        } else if (gender.substring(0,1).equalsIgnoreCase("E")) {
            System.out.println(" idel kilonuz "+ idealWeightMale);
        }else if (gender.substring(0,1).equalsIgnoreCase("x")) {
            System.out.println(" ideal kilonuz "+ idealWeight);
        }else {
            System.out.println("Yanlis Cinsiyet secimi yaptiniz");
            bodyMass();
        }

        if (massIndex  < 16) {
            System.out.println("***************Anoreksi veya Eksik Beslenme***********");

        } else if (massIndex  < 18.5) {
            System.out.println("******************Zayıf***********");

        } else if (massIndex  < 25) {
            System.out.println("***************ideal Kilo*****************");

        } else if (massIndex  < 30) {
            System.out.println("**********kilolu*************");

        } else if (massIndex  < 35) {
            System.out.println("************1. Sınıf Orta Obezite***************");

        } else if (massIndex  < 40) {
            System.out.println("*************2. Sınıf Yüksek Obezite************8");

        }else {
            System.out.println("****Hesap araliginin disinda degerler***" );
        }
    }

    @Override
    public int newChoice() {
        System.out.println("Ana menu icin 1'e;\n" +
                "Tekrar kontrol etmek icin 2 ye" +
                "\nCikmak icin 0'a basiniz");
        return scanner.nextInt();
    }

    @Override
    public void wrongChoice() {
        System.out.println("Yanlis secim.Ana menuye donuluyor.");
    }
}

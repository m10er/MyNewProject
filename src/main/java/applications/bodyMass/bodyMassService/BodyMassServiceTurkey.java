package applications.bodyMass.bodyMassService;

public class BodyMassServiceTurkey extends BodyMassService {

    @Override
    void welcomeMesssage() {
        System.out.println("Dünya Sağlık Örgütü (WHO) vücut kitle indeksine gore kutle endeksi programina hosgeldiniz");

    }

    @Override
    void wrongChoiceMessage() {
        System.out.println("Yanlis secim.Ana menuye donuluyor.");
    }

    @Override
    void newChoiceMessage() {
        System.out.println("Ana menu icin 1'e;\n" +
                "Tekrar kontrol etmek icin 2 ye" +
                "\nCikmak icin 0'a basiniz");
    }

    @Override
    void bodyMas() {
        System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin 'E' \nKadin icin 'K'\n" +
                "Cinsiyet belirtmemek icin 'x' tuslayiniz");
        String gender = null;
        try {
            gender = scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }
        System.out.println("Lutfen boyunuzu santimetre olarak giriniz (165, 156 seklinde) ");
        double size = 0;
        try {
            size = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }
        System.out.println("Lutfen kilonuzu giriniz");
        double weight = 0;
        try {
            weight = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }

        double massIndex = (weight / ((size/100) * (size/100)));
        double idealWeightMale= 50 +2.3 * ((size / 2.54) -60);
        double idealWeightwoman = 45 +2.3 * ((size / 2.54) -60);
        double idealWeight= 48 +2.3 * ((size / 2.54) -60);
        try {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
}

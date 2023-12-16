package applications.bodyMass.bodyMassService;

public class BodyMassServiceEnglish extends BodyMassService {

    @Override
    void welcomeMesssage() {
        System.out.println("Dünya Sağlık Örgütü (WHO) vücut kitle indeksine gore kutle endeksi programina hosgeldiniz");

    }

    @Override
    void wrongChoiceMessage() {
        System.out.println("Wrong selection. Returning to the main menu.");
    }

    @Override
    void newChoiceMessage() {
        System.out.println("Press 1 for the main menu;\n" +
                "Press 2 to check again." +
                "\nPress 0 to exit");
    }

    @Override
    void bodyMas() {
        System.out.println("Please enter your gender\n" +
                "'M' for male\n" +
                "'F' for female\n" +
                "If you do not want to specify gender, write 'x'");
        String gender = null;
        try {
            gender = scanner.next();
        } catch (Exception e) {
            e.getMessage();
            bodyMass();
        }
        System.out.println("Please enter your height in centimeters (165, 156) ");
        double size = 0;
        try {
            size = scanner.nextDouble();
        } catch (Exception e) {
            e.getMessage();
            bodyMass();
        }
        System.out.println("Please enter your weight");
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
            if(gender.substring(0,1).equalsIgnoreCase("F")){
                System.out.println(" your ideal weight = "+idealWeightwoman);
            } else if (gender.substring(0,1).equalsIgnoreCase("M")) {
                System.out.println(" your ideal weight "+ idealWeightMale);
            } else if (gender.substring(0,1).equalsIgnoreCase("x")) {
                System.out.println(" your ideal weight "+ idealWeight);
            } else {
                System.out.println(" You chose the wrong gender ");
                bodyMass();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }
        if (massIndex  < 16) {
            System.out.println("***************Anorexia or Malnutrition***********");

        } else if (massIndex  < 18.5) {
            System.out.println("******************Weak***********");

        } else if (massIndex  < 25) {
            System.out.println("***************ideal weight*****************");

        } else if (massIndex  < 30) {
            System.out.println("**********fat*************");

        } else if (massIndex  < 35) {
            System.out.println("************Class 1 Moderate Obesity***************");

        } else if (massIndex  < 40) {
            System.out.println("*************Class 2 High Obesity************8");

        }  else {
            System.out.println("****Values outside the calculation range***" );
        }
    }
}

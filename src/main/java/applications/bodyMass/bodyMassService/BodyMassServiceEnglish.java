package applications.bodyMass.bodyMassService;

import java.util.Scanner;

public class BodyMassServiceEnglish implements BodyMassService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public void welcomeMessagge() {
        System.out.println("Dünya Sağlık Örgütü (WHO) vücut kitle indeksine gore kutle endeksi programina hosgeldiniz");
    }

    @Override
    public void bodyMass() {
        System.out.println("Please enter your gender\n" +
                "'M' for male\n" +
                "'F' for female\n" +
                "If you do not want to specify gender, write 'x'");
        String gender = scanner.next();
        System.out.println("Please enter your height in centimeters (165, 156) ");
        double size = scanner.nextDouble();
        System.out.println("Please enter your weight");
        double weight = scanner.nextDouble();
        double massIndex = (weight / ((size/100) * (size/100)));
        double idealWeightMale= 50 +2.3 * ((size / 2.54) -60);
        double idealWeightwoman = 45 +2.3 * ((size / 2.54) -60);
        double idealWeight= 48 +2.3 * ((size / 2.54) -60);
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

    @Override
    public int newChoice() {
        System.out.println("Press 1 for the main menu;\n" +
                "Press 2 to check again." +
                "\nPress 0 to exit");

        return  scanner.nextInt();
    }

    @Override
    public void wrongChoice() {
        System.out.println("Wrong selection. Returning to the main menu.");
    }
}

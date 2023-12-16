package applications.bodyMass.bodyMassService;

public class BodyMassServiceDeutsch extends BodyMassService {

    @Override
    void welcomeMesssage() {
        System.out.println("Willkommen beim Massenindexprogramm gemäß dem Body-Mass-Index der Weltgesundheitsorganisation (WHO)");

    }

    @Override
    void wrongChoiceMessage() {
        System.out.println("Falsche Auswahl. Rückkehr zum Hauptmenü.");
    }


    @Override
    void newChoiceMessage() {
            System.out.println("Drücken Sie 1 für das Hauptmenü.\n" +
                    "Drücken Sie 2, um es noch einmal zu überprüfen." +
                    "\nDrücken Sie 0, um den Vorgang zu beenden");
    }

    @Override
    void bodyMas() {

        System.out.println("Bitte geben Sie Ihr Geschlecht ein\n" +
                "M für männlich\n " +
                "W für weiblich\n" +
                "Wenn Sie kein Geschlecht angeben möchten, schreiben Sie 'x'");
        String gender = null;
        try {
            gender = scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }
        System.out.println("Bitte geben Sie Ihre Körpergröße in Zentimetern ein (165, 156) ");
        double size = 0;
        try {
            size = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }
        System.out.println("Bitte geben Sie Ihr Gewicht ein");
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
            if(gender.substring(0,1).equalsIgnoreCase("W")){
                System.out.println(" Idealgewicht = "+idealWeightwoman);
            } else if (gender.substring(0,1).equalsIgnoreCase("M")) {
                System.out.println(" Idealgewicht "+ idealWeightMale);
            } else if (gender.substring(0,1).equalsIgnoreCase("X")) {
                System.out.println(" Ihr Idealgewicht "+ idealWeight);
            } else {
                System.out.println(" Falsche Geschlechtsauswahl ");
                bodyMass();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bodyMass();
        }
        if (massIndex  < 16) {
            System.out.println("***************Magersucht oder Unterernährung***********");

        } else if (massIndex  < 18.5) {
            System.out.println("******************Schwach***********");

        } else if (massIndex  < 25) {
            System.out.println("***************Idealgewicht*****************");

        } else if (massIndex  < 30) {
            System.out.println("**********fett*************");

        } else if (massIndex  < 35) {
            System.out.println("************Mässige Fettleibigkeit der Klasse 1***************");

        } else if (massIndex  < 40) {
            System.out.println("*************Hohe Fettleibigkeit der Klasse 2************8");

        } else {
            System.out.println("****Werte ausserhalb des Berechnungsbereichs***" );
        }
    }
}

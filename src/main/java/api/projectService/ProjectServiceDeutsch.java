package api.projectService;

import java.util.Scanner;

public class ProjectServiceDeutsch implements ProjectService{

    static Scanner scanner= new Scanner(System.in);
    @Override
    public String projectMenu() {
        System.out.println("Geben Sie die Nummer des Projekts ein, das Sie testen möchten" +
                "\n1.Atm" +
                "\n2.Idealgewicht " +
                "\n3.Horoskopvorhersage " +
                "\n4.Sprachwechsel" +
                "\n5.Beenden");
        return scanner.next();
    }

    @Override
    public int newChoice() {
        System.out.println("Drücken Sie 0, um den Vorgang zu beenden" +
                "\nDrücken Sie 0, um den Vorgang zu beenden");
        return scanner.nextInt();
    }

    @Override
    public void exit() {
        System.out.println("„Das System wurde abgemeldet. " +
                "\nDanke, daß Sie uns gewählt haben." );
        System.exit(0);
    }

    @Override
    public void wrongChoice() {
        System.out.println("falsche Wahl. Bitte versuchen Sie es erneut");
    }
    @Override
    public String changeLanguage() {
        System.out.println("Ingilizce icin '1'\n" +
                "Almanca icin '2'\n" +
                "Turkce icin '3'");
        int choice=scanner.nextInt();
        String language="";
        if (choice==1){
            language="E";
        } else if (choice==2) {
            language="D";
        } else if (choice==3) {
            language="T";
        }else {
            System.out.println("falsche Wahl");
            changeLanguage();
        }

        return language;
    }
}

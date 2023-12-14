package applications.atm.AtmService;

import users.User;

import java.util.Scanner;

public class AtmManagerServiceDeutsch implements AtmManagerService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public void welcomeMessage() {
        System.out.println("\"Willkommen bei der Team130 Bank\n" +
                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public String tradingOptions() {
        System.out.println( "1----Balance-Ansicht---------" +
                "\n2--------Geld abheben------------- " +
                "\n3---------Geld einzahlen-----------" +
                "\n4---------Um zum Hauptprojekt zu gelangen------------"+
                "\n5=======Um das Projekt zu verlassen=======");
        return  scanner.next();
    }

    @Override
    public void balanceView(User user) {
        System.out.println("Kontostand=" + user.getAccaountBalance());
    }

    @Override
    public void withdrawMoney(User user) {
        System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten");
        double money = scanner.nextDouble();

        if (money > user.getAccaountBalance()) {
            System.out.println("Ihr Guthaben reicht nicht aus.");
        } else {
            user.setAccaountBalance(user.getAccaountBalance() - money);
            System.out.println("Die Auszahlung wurde erfolgreich abgeschlossen" +
                    "\nVerfügbares Guthaben=" + user.getAccaountBalance());
        }
    }

    @Override
    public void depositMoney(User user) {
        System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten");
        double money = scanner.nextDouble();
        user.setAccaountBalance(user.getAccaountBalance()+money);
        System.out.println("Ihr neues Gleichgewicht" + user.getAccaountBalance());
    }

    @Override
    public void exit() {
        System.out.println("„Das System wurde abgemeldet. " +
                "\nDanke, daß Sie uns gewählt haben." );
    }

    @Override
    public void wrongChoice() {
        System.out.println("Falsche Auswahl. Bitte versuchen Sie es erneut");
    }

    @Override
    public int newChoice() {
        System.out.println("Drücken Sie 1, um zum ATM-Menü zurückzukehren\n" +
                "Drücken Sie 2 für das Hauptmenü." +
                "\nDrücken Sie 0, um den Vorgang zu beenden");
        return  scanner.nextInt();
    }
}

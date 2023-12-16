package applications.atm.AtmService;

public class AtmManagerServiceDeutsch extends AtmManagerService {

    @Override
    void atmWelcomeMessage() {
        System.out.println("Willkommen bei der Team130 Bank\n" +
                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }

    @Override
    void tradingOptionMessage() {
        System.out.println( "1----Balance-Ansicht---------" +
                "\n2--------Geld abheben------------- " +
                "\n3---------Geld einzahlen-----------" +
                "\n4---------Um zum Hauptprojekt zu gelangen------------"+
                "\n5=======Um das Projekt zu verlassen=======");
    }

    @Override
    void balanceMessage() {
        System.out.println("Kontostand=");
    }

    @Override
    void withDrawMoneyMessage() {
        System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten");
    }

    @Override
    void insufficientBalance() {
        System.out.println("Ihr Guthaben reicht nicht aus.");

    }

    @Override
    void successWithdrawmessage() {
        System.out.println("Die Auszahlung wurde erfolgreich abgeschlossen" +
                "\nVerfügbares Guthaben=");
    }

    @Override
    void exitMessage() {
        System.out.println("„Das System wurde abgemeldet. " +
                "\nDanke, daß Sie uns gewählt haben." );
    }

    @Override
    void wrongChoiceMessage() {
        System.out.println("Falsche Auswahl. Bitte versuchen Sie es erneut");
    }

    @Override
    void newChoiceMessage() {
        System.out.println("Drücken Sie 1, um zum ATM-Menü zurückzukehren\n" +
                "Drücken Sie 2 für das Hauptmenü." +
                "\nDrücken Sie 0, um den Vorgang zu beenden");
    }

    @Override
    void depositMoney1Message() {
        System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten");
    }

    @Override
    void depositMoney2Message() {
        System.out.println("Ihr neues Gleichgewicht");
    }
}

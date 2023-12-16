package api.projectService;

public class ProjectServiceDeutsch extends ProjectService {

    @Override
    void projectOption() {
        System.out.println("Geben Sie die Nummer des Projekts ein, das Sie testen möchten" +
                "\n1.Atm" +
                "\n2.Idealgewicht " +
                "\n3.Horoskopvorhersage " +
                "\n4.Sprachwechsel" +
                "\n5.Beenden");
    }

    @Override
    void choicenew() {
        System.out.println("Drücken Sie 0, um den Vorgang zu beenden" +
                "\nDrücken Sie 0, um den Vorgang zu beenden");
    }

    @Override
    void quit() {
        System.out.println("„Das System wurde abgemeldet. " +
                "\nDanke, daß Sie uns gewählt haben." );
    }

    @Override
    void choiceWrong() {
        System.out.println("falsche Wahl. Bitte versuchen Sie es erneut");
    }

    @Override
    void languageOption() {
        System.out.println("fur English '1'\n" +
                "fur Deutsch '2'\n" +
                "fur Turkisch '3'");
    }
    @Override
    void languageException() {
        System.out.println("falsche Wahl");
    }
}

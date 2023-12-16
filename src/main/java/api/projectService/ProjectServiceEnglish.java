package api.projectService;


public class ProjectServiceEnglish extends ProjectService {
    @Override
    void projectOption() {
        System.out.println("Enter the number of the project you want to test" +
                "\n1.Atm" +
                "\n2.Ideal Weight " +
                "\n3.Horoscope prediction " +
                "\n4.Change language" +
                "\n5.Exit");
    }

    @Override
    void choicenew() {
        System.out.println("Press 1 to return to main menu;" +
                "\nPress 0 to exit");

    }

    @Override
    void quit() {
        System.out.println("The system has been logged out.\nThank you for choosing us");

    }

    @Override
    void choiceWrong() {
        System.out.println("Wrong selection. Please try again");

    }

    @Override
    void languageOption() {
        System.out.println("for English '1'\n" +
                "for German '2'\n" +
                "for Turkish'3'");
    }

    @Override
    void languageException() {
        System.out.println("wrong choice");
    }
}

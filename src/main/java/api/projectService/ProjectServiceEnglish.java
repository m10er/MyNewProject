package api.projectService;

import java.util.Scanner;

public class ProjectServiceEnglish implements ProjectService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public String projectMenu() {

        System.out.println("Enter the number of the project you want to test" +
                "\n1.Atm" +
                "\n2.Ideal Weight " +
                "\n3.Horoscope prediction " +
                "\n4.Change language" +
                "\n5.Exit");
        return scanner.next();
    }

    @Override
    public int newChoice() {
        System.out.println("Press 1 to return to main menu;" +
                "\nPress 0 to exit");
        return  scanner.nextInt();
    }

    @Override
    public void exit() {
        System.out.println("The system has been logged out.\nThank you for choosing us");
        System.exit(0);
    }

    @Override
    public void wrongChoice() {
        System.out.println("Wrong selection. Please try again");
    }
    @Override
    public String changeLanguage() {
        System.out.println("for English '1'\n" +
                "for German '2'\n" +
                "for Turkish'3'");
        int choice=scanner.nextInt();
        String language="";
        if (choice==1){
            language="E";
        } else if (choice==2) {
            language="D";
        } else if (choice==3) {
            language="T";
        }else {
            System.out.println("wrong choice");
            changeLanguage();
        }

        return language;
    }
}

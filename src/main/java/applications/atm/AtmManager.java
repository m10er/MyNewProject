package applications.atm;

import api.ProjectController;
import applications.atm.AtmService.AtmManagerService;
import applications.atm.AtmService.AtmManagerServiceDeutsch;
import applications.atm.AtmService.AtmManagerServiceEnglish;
import applications.atm.AtmService.AtmManagerServiceTurkce;
import users.User;

import java.util.Scanner;

public class AtmManager {

    static Scanner scanner = new Scanner(System.in);
    ProjectController projectController;
    AtmManagerService atmManagerService;
    User user;

    public AtmManager(User user, String languageLetter) {
        if (languageLetter.equalsIgnoreCase("D")){
            this.atmManagerService= new AtmManagerServiceDeutsch();
        } else if (languageLetter.equalsIgnoreCase("E")) {
            this.atmManagerService= new AtmManagerServiceEnglish();
        } else if (languageLetter.equalsIgnoreCase("T")) {
            this.atmManagerService=new AtmManagerServiceTurkce();
        } else {
            System.out.println("language is missing");
        }
        projectController= new ProjectController();
        this.user = user;
        atmWelcome();
        atmChoice(languageLetter);

    }

    public void atmWelcome() {
        atmManagerService.welcomeMessage();
    }
    public void atmChoice(String languageLetter){

        switch (atmManagerService.tradingOptions()) {
            case "1":
                atmManagerService.balanceView(user);
                option(user,languageLetter);
                break;
            case "2":
                atmManagerService.withdrawMoney(user);
                option(user,languageLetter);
                break;
            case "3":
               atmManagerService.depositMoney(user);
                option(user,languageLetter);
                break;
            case "4":
                atmManagerService.exit();
                projectController.start(user, languageLetter);
            case "5":
                projectController.exit(languageLetter);
                break;
            default:
                atmManagerService.wrongChoice();
        }
    }public  void  option(User user, String languageLetter){
        int choice= atmManagerService.newChoice();
        if(choice==1){
            atmChoice(languageLetter);
        }else if (choice==0){
            projectController.exit(languageLetter);
        }else if (choice==2) {
            projectController.start(user, languageLetter);
        }else {
           atmManagerService.wrongChoice();
            atmChoice(languageLetter);
        }
    }
}

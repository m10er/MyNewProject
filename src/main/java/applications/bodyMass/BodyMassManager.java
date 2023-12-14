package applications.bodyMass;

import api.ProjectController;
import applications.bodyMass.bodyMassService.BodyMassService;
import applications.bodyMass.bodyMassService.BodyMassServiceDeutsch;
import applications.bodyMass.bodyMassService.BodyMassServiceEnglish;
import applications.bodyMass.bodyMassService.BodyMassServiceTurkce;
import users.User;

public class BodyMassManager {

    ProjectController projectController;
    BodyMassService bodyMassService;
    User user;

    public BodyMassManager(User user, String languageLetter) {
        projectController= new ProjectController();
        if (languageLetter.equalsIgnoreCase("D")){
           this.bodyMassService= new BodyMassServiceDeutsch();
        } else if (languageLetter.equalsIgnoreCase("E")) {
            this.bodyMassService= new BodyMassServiceEnglish();
        } else if (languageLetter.equalsIgnoreCase("T")) {
            this.bodyMassService= new BodyMassServiceTurkce();
        } else {
            System.out.println("language is missing");
        }
        this.user = user;
        welcomeBodyMass();
        startBodyMass();
        newChoice(languageLetter);

    }

    private void newChoice(String languageLetter) {
        int choice = bodyMassService.newChoice();
        if(choice==1){
            projectController.start(user, languageLetter);
        }else if (choice==2){
            startBodyMass();
        }else if (choice==0) {
            projectController.exit(languageLetter);
        }else {
            bodyMassService.wrongChoice();
            projectController.start(user, languageLetter);
        }
    }


    public void welcomeBodyMass(){
        bodyMassService.welcomeMessagge();

    }
    public void startBodyMass(){
        bodyMassService.bodyMass();
    }
}

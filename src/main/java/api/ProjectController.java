package api;

import api.projectService.ProjectService;
import api.projectService.ProjectServiceDeutsch;
import api.projectService.ProjectServiceEnglish;
import api.projectService.ProjectServiceTurkce;
import applications.atm.AtmManager;
import applications.bodyMass.BodyMassManager;
import applications.horoscopePrediction.HoroscopePredictionManager;
import users.*;

import java.util.Scanner;

public class ProjectController {
    static Scanner scanner = new Scanner(System.in);
    ProjectService projectService;
    UserService userService;
    User user;
    AtmManager atmManager;
    BodyMassManager bodyMassManager;
    HoroscopePredictionManager horoscopePredictionManager;

    public ProjectController() {

    }
    public void login(){
        System.out.println("Lutfen bir dil seciniz.\n" +
                "turkce icin T;\n" +
                "fur Deutch D;\n" +
                "for English E");
        String option= null;
        try {
            option = scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            login();
        }
        String languageLetter= "";
        try {
            if(option.equalsIgnoreCase("D")){
                this.userService = new UserServiceDeutsch();
                languageLetter="D";
            } else if (option.equalsIgnoreCase("E")) {
                this.userService= new UserServiceEnglish();
                languageLetter="E";
            }else {
                this.userService= new UserServiceTurkce();
                languageLetter="T";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            login();
        }
        this.user=userService.save();
        start(user, languageLetter);
    }

    public void start(User user, String languageLetter) {
        if (languageLetter.equalsIgnoreCase("D")){
            this.projectService=new ProjectServiceDeutsch();
        } else if (languageLetter.equalsIgnoreCase("E")) {
            this.projectService=new ProjectServiceEnglish();
        } else if (languageLetter.equalsIgnoreCase("T")) {
            this.projectService=new ProjectServiceTurkce();
        } else {
            System.out.println("language is missing");
        }
        String option = projectService.projectMenu();
        switch (option) {
            case "1":
                atmManager = new AtmManager(user, languageLetter);
                option(user,languageLetter);
                break;
            case "2":
                bodyMassManager= new BodyMassManager(user,languageLetter);
               option(user,languageLetter);
                break;
            case "3":
                horoscopePredictionManager= new HoroscopePredictionManager(user,languageLetter);
             option(user, languageLetter);
                break;
            case "4":
                String letterChange= projectService.changeLanguage();
                start(user,letterChange);
                break;
            case "5":
                exit(languageLetter);
                break;
            default:
                projectService.wrongChoice();
                start(user,languageLetter);
        }


    }public void exit(String languageLetter){

        if (languageLetter.equalsIgnoreCase("D")){
            this.projectService= new ProjectServiceDeutsch();
        } else if (languageLetter.equalsIgnoreCase("E")) {
            this.projectService= new ProjectServiceEnglish();
        } else if (languageLetter.equalsIgnoreCase("T")) {
            this.projectService= new ProjectServiceTurkce();
        } else {
            System.out.println("language is missing");
        }
        projectService.exit();
    }
    public void option(User user, String languageLetter){
        String choice= projectService.newChoice();
        if ( choice.equals("1")) {
            start(user,languageLetter);
        } else if (choice.equals("0")) {
            projectService.exit();
        } else {
           projectService.wrongChoice();
            start(user,languageLetter);
        }
    }
}

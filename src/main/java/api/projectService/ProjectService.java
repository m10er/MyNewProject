package api.projectService;

import java.util.Scanner;

public abstract class ProjectService {
    static Scanner scanner=new Scanner(System.in);
    public String projectMenu(){
      projectOption();
        String option= null;
        try {
            option = scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            choiceWrong();
            projectMenu();
        }
        return  option;
    }

    public String newChoice(){
       choicenew();
        String option = null;
        try {
            option = scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return option;
    }

    public void exit(){
    quit();
    System.exit(0);
    }

    public void wrongChoice(){
    choiceWrong();
    }

    public String changeLanguage(){
       languageOption();
        int choice= 0;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            languageException();
        }
        String language="";
        if (choice==1){
            language="E";
        } else if (choice==2) {
            language="D";
        } else if (choice==3) {
            language="T";
        }else {
            choiceWrong();
            changeLanguage();
        }
        return language;
    }
    abstract void projectOption();
    abstract void choicenew();
    abstract void quit();
    abstract void choiceWrong();
    abstract void languageOption();
    abstract void languageException();
}

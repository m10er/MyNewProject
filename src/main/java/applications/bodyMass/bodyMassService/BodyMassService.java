package applications.bodyMass.bodyMassService;

import java.util.Scanner;

public abstract class BodyMassService {
    static Scanner scanner = new Scanner(System.in);
   public void welcomeMessagge(){
        welcomeMesssage();
    }

   public void bodyMass(){
        bodyMas();
    }
   public int newChoice(){
        newChoiceMessage();
       int option = 0;
       try {
           option = scanner.nextInt();
       } catch (Exception e) {
           System.out.println(e.getMessage());
           newChoice();
       }
       return option;
    }

   public void wrongChoice(){
        wrongChoiceMessage();
    }
    abstract void welcomeMesssage();
    abstract void wrongChoiceMessage();
    abstract void  newChoiceMessage();
    abstract void bodyMas();
}

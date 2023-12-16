package applications.atm.AtmService;

import users.User;

import java.util.Scanner;

public abstract class AtmManagerService {
    static Scanner scanner= new Scanner(System.in);
  public void welcomeMessage(){
      atmWelcomeMessage();
  }

  public String tradingOptions(){
      tradingOptionMessage();
      String option = null;
      try {
          option = scanner.next();
      } catch (Exception e) {
          System.out.println(e.getMessage());
          tradingOptions();
      }
      return option;
  }

   public void balanceView(User user){
      balanceMessage();
       System.out.println("===>"+user.getAccaountBalance());
   }

   public void withdrawMoney(User user){
       withDrawMoneyMessage();
       double money = 0;
       try {
           money = scanner.nextDouble();
       } catch (Exception e) {
           e.printStackTrace();
           withdrawMoney(user);
       }

       if (money > user.getAccaountBalance()) {
          insufficientBalance();
       } else {
           user.setAccaountBalance(user.getAccaountBalance() - money);
           successWithdrawmessage();
           System.out.print("===>"+user.getAccaountBalance());
       }
   }

    public void depositMoney(User user){
        depositMoney1Message();
        double money = 0;
        try {
            money = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            depositMoney(user);
        }
        user.setAccaountBalance(user.getAccaountBalance() + money);
        depositMoney2Message();
        System.out.print("===>"+user.getAccaountBalance());
    }

   public void exit(){
exitMessage();
   }

    public void wrongChoice(){
wrongChoiceMessage();
    }

   public int newChoice(){
     newChoiceMessage();
       int choice= 0;
       try {
           choice = scanner.nextInt();
       } catch (Exception e) {
           System.out.println(e.getMessage());
           newChoice();
       }
       return choice;
   }
   abstract void atmWelcomeMessage();
  abstract void tradingOptionMessage();
  abstract void balanceMessage();
  abstract void withDrawMoneyMessage();
  abstract void insufficientBalance();
  abstract void successWithdrawmessage();
  abstract  void exitMessage();
  abstract void wrongChoiceMessage();
  abstract void newChoiceMessage();
  abstract void depositMoney1Message();
  abstract void depositMoney2Message();

}

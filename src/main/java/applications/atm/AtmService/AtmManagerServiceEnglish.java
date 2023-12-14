package applications.atm.AtmService;

import users.User;

import java.util.Scanner;

public class AtmManagerServiceEnglish implements  AtmManagerService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public void welcomeMessage() {
        System.out.println("\"Welcome to Team130 Bank \" +\n" +
                "            \"\\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public String  tradingOptions() {
        System.out.println( "1----Balance viewing---------" +
                "\n2--------Withdraw money------------- " +
                "\n3---------Deposit money-----------" +
                "\n4---------To go to MainProject-------------"+
                "\n5=======To exit the project=======");
        return scanner.next();
    }

    @Override
    public void balanceView(User user) {
        System.out.println("your balance=" + user.getAccaountBalance());
    }

    @Override
    public void withdrawMoney(User user) {
        System.out.println("Type the amount you want to withdraw");
        double money = scanner.nextDouble();

        if (money > user.getAccaountBalance()) {
            System.out.println("Your balance is insufficient.");
        } else {
            user.setAccaountBalance(user.getAccaountBalance() - money);
            System.out.println("Withdrawal has been completed successfully" +
                    "\nAvailable balance=" + user.getAccaountBalance());
        }
    }

    @Override
    public void depositMoney(User user) {
        System.out.println("Enter the amount you want to deposit");
        double money = scanner.nextDouble();
        user.setAccaountBalance(user.getAccaountBalance()+money);
        System.out.println("your new balance" + user.getAccaountBalance());
    }

    @Override
    public void exit() {
        System.out.println("The system has been logged out.\nThank you for choosing us");
    }

    @Override
    public void wrongChoice() {
        System.out.println("Wrong selection. Please try again");
    }

    @Override
    public int newChoice() {
        System.out.println("Press 1 to return to the ATM menu;\n" +
                "Press 2 for the main menu" +
                "\nPress 0 to exit");

        return  scanner.nextInt();
    }
}

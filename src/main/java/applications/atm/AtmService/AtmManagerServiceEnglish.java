package applications.atm.AtmService;


public class AtmManagerServiceEnglish extends AtmManagerService {

    @Override
    void atmWelcomeMessage() {
        System.out.println("Welcome to Team130 Bank\n" +
                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    void tradingOptionMessage() {
        System.out.println("1----Balance viewing---------" +
                "\n2--------Withdraw money------------- " +
                "\n3---------Deposit money-----------\n" +
                "4-----------To go to MainProject-------------" +
                "\n5=======To exit the project=======");
    }

    @Override
    void balanceMessage() {
        System.out.println("your balance=");
    }

    @Override
    void withDrawMoneyMessage() {
        System.out.println("Type the amount you want to withdraw");
    }

    @Override
    void insufficientBalance() {
        System.out.println("Your balance is insufficient.");
    }

    @Override
    void successWithdrawmessage() {
        System.out.println("Withdrawal has been completed successfully" +
                "\nAvailable balance=");
    }

    @Override
    void exitMessage() {
        System.out.println("The system has been logged out.\nThank you for choosing us");
    }

    @Override
    void wrongChoiceMessage() {
        System.out.println("Wrong selection. Please try again");
    }

    @Override
    void newChoiceMessage() {
        System.out.println("Press 1 to return to the ATM menu;\n" +
                "Press 2 for the main menu" +
                "\nPress 0 to exit");
    }

    @Override
    void depositMoney1Message() {
        System.out.println("Enter the amount you want to deposit");
    }

    @Override
    void depositMoney2Message() {
        System.out.println("your new balance");
    }
}

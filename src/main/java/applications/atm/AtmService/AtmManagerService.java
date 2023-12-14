package applications.atm.AtmService;

import users.User;

public interface AtmManagerService {

    void welcomeMessage();

    String tradingOptions();

    void balanceView(User user);

    void withdrawMoney(User user);

    void depositMoney(User user);

    void exit();

    void wrongChoice();

    int newChoice();
}

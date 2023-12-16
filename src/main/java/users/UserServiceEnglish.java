package users;

public class UserServiceEnglish extends UserService {


    @Override
    void userName() {
        System.out.println("Please enter the name of the user you want to add.");

    }

    @Override
    void password() {
        System.out.println("Please enter the user password you want to add.");

    }

    @Override
    void registeredNameException() {
        System.out.println("The username registered in the system. Please try with a different username.");

    }

    @Override
    void characterLessThen6Exception() {
        System.out.println("Username must be at least 6 characters");

    }

    @Override
    void userNameContainsSpace() {
        System.out.println("Username does not contain spaces");

    }

    @Override
    void passwordLessThen4Character() {
        System.out.println("Your password must consist of at least 4 characters.");

    }

    @Override
    void passwordContainsSpace() {
        System.out.println("There cannot be spaces in your password");

    }

    @Override
    void saveSuccess() {
        System.out.println("Your registration to the system has been done successfully.");

    }

    @Override
    void wrongValue() {
        System.out.println("Wrong Value Entry");
    }

}

package users;

import java.util.Scanner;

public class UserServiceEnglish implements UserService{

    static Scanner scanner = new Scanner(System.in);
    InMemoryUsersRepository inmemoryUserRepository;
    User user;

    public UserServiceEnglish() {
        this.inmemoryUserRepository = new InMemoryUsersRepository();
        this.user=new User();
    }

    @Override
    public User save() {
        System.out.println("Please enter the name of the user you want to add.");
        String userName = scanner.next();
        System.out.println("Please enter the user password you want to add.");
        String userPassword = scanner.next();

        boolean flag = true;
        for (int i = 0; i < inmemoryUserRepository.userList.size(); i++) {
            if (userName.equals(inmemoryUserRepository.userList.get(i).getUserName())){
                System.out.println("The username registered in the system. Please try with a different username.");
                flag=false;
            }

        }
        if (userName.length()<6){
            System.out.println("Username must be at least 6 characters");
            flag = false;
        }
        if (userName.contains(" ")){
            System.out.println("Username does not contain spaces");
            flag = false;
        }
        if (userPassword.length()<4){
            System.out.println("Your password must consist of at least 4 characters.");
            flag = false;
        }if (userPassword.contains(" ")){
            System.out.println("There cannot be spaces in your password");
            flag = false;
        }
        if (flag){
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserLanguage("English");
            inmemoryUserRepository.add(user);
            System.out.println("Your registration to the system has been done successfully.");
        }else {
            save();
        }
        return user;

    }

}

package users;

import java.util.Scanner;

public abstract class UserService {
    static Scanner scanner= new Scanner(System.in);
    InMemoryUsersRepository inMemoryUsersRepository;
    User user;

    public UserService() {
        this.inMemoryUsersRepository = new InMemoryUsersRepository();
        this.user = new User();
    }
    public User save(){
        user.setUserName(saveName());
        user.setUserPassword(savePassword());
        saveSuccess();
        return user;
    }
    public String saveName() {
        boolean flagName = true;
        userName();
        String userName = null;
        try {
            userName = scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            wrongValue();
            flagName = false;
        }

        for (int i = 0; i < inMemoryUsersRepository.userList.size(); i++) {
            try {
                if (userName.equals(inMemoryUsersRepository.userList.get(i).getUserName())) {
                    registeredNameException();
                    flagName = false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                saveName();
            }
        }
        try {
            if (userName.length() < 6) {
                characterLessThen6Exception();
                flagName = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            saveName();
        }
        if (userName.contains(" ")) {
            userNameContainsSpace();
            flagName = false;
        }
        if (!flagName){
            saveName();
        }
        return userName;
    }
    public String savePassword(){
        boolean flagPassword=true;
      password();
       String userPassword=null;
        try {
            userPassword= scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            wrongValue();
            flagPassword=false;
        }

        try {
            if (userPassword.length()<4){
               passwordLessThen4Character();
               flagPassword = false;
           }
            if (userPassword.contains(" ")){
                passwordContainsSpace();
                flagPassword = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            savePassword();
        }

        if (!flagPassword){
           savePassword();
       }

       return userPassword;

   }

   abstract void userName();
    abstract void password();
    abstract void registeredNameException();
    abstract void characterLessThen6Exception();
    abstract void userNameContainsSpace();
    abstract void passwordLessThen4Character();
    abstract void passwordContainsSpace();
    abstract void saveSuccess();
    abstract void wrongValue();

}

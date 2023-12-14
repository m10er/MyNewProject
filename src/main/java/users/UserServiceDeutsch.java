package users;

import java.util.Scanner;

public class UserServiceDeutsch implements UserService{

    static Scanner scanner = new Scanner(System.in);
    InMemoryUsersRepository inmemoryUserRepository;
    User user;

    public UserServiceDeutsch() {
        this.inmemoryUserRepository = new InMemoryUsersRepository();
        this.user=new User();
    }

    @Override
    public User save() {
        System.out.println("Bitte geben Sie den Namen des Benutzers ein, den Sie hinzufügen möchten.");
        String userName = scanner.next();
        System.out.println("Bitte geben Sie das Benutzerpasswort ein, das Sie hinzufügen möchten.");
        String userPassword = scanner.next();

        boolean flag = true;
        for (int i = 0; i < inmemoryUserRepository.userList.size(); i++) {
            if (userName.equals(inmemoryUserRepository.userList.get(i).getUserName())){
                System.out.println("Der im System registrierte Benutzername. Bitte versuchen Sie es mit einem anderen Benutzernamen.");
                flag=false;
            }

        }
        if (userName.length()<6){
            System.out.println("Der Benutzername muss mindestens 6 Zeichen lang sein");
            flag = false;
        }
        if (userName.contains(" ")){
            System.out.println("Der Benutzername enthält keine Leerzeichen");
            flag = false;
        }
        if (userPassword.length()<4){
            System.out.println("Ihr Passwort muss aus mindestens 4 Zeichen bestehen.");
            flag = false;
        }if (userPassword.contains(" ")){
            System.out.println("Ihr Passwort darf keine Leerzeichen enthalten");
            flag = false;
        }

        if (flag){
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserLanguage("Deutsch");
            inmemoryUserRepository.add(user);
            System.out.println("Ihre Registrierung im System wurde erfolgreich durchgeführt.");
        }else {
            UserServiceDeutsch userServiceDeutsch= new UserServiceDeutsch();
            userServiceDeutsch.save();
        }
        return user;

    }
}

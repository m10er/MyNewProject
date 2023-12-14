package users;

import java.util.Scanner;

public class UserServiceTurkce implements UserService{


    InMemoryUsersRepository inmemoryUserRepository;
    User user;

    public UserServiceTurkce() {
        this.inmemoryUserRepository = new InMemoryUsersRepository();
        this.user=new User();
    }

    @Override
    public User save() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz kullanicinin adini giriniz");
        String userName = scanner.next();
        System.out.println("Lutfen eklemek istediginiz kullanici sifrenizi giriniz");
        String userPassword = scanner.next();

        boolean flag = true;
        for (int i = 0; i < inmemoryUserRepository.userList.size(); i++) {
            if (userName.equals(inmemoryUserRepository.userList.get(i).getUserName())){
                System.out.println("sisteme kayitli kullanici adi.Lutfen farkli kullanici adi ile deneyiniz");
                flag=false;
            }

        }
        if (userName.length()<6){
            System.out.println("kullanici adi en az 6 karakter olmali");
            flag = false;
        }
        if (userName.contains(" ")){
            System.out.println("Kullanii adi bosluk iceremez");
            flag = false;
        }
        if (userPassword.length()<4){
            System.out.println("sifreniz en az 4 karakterden olusmali");
            flag = false;
        }if (userPassword.contains(" ")){
            System.out.println("sifrenizde bosluk olamaz");
            flag = false;
        }

        if (flag){
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserLanguage("Turkce");
            inmemoryUserRepository.add(user);
            System.out.println("sisteme kaydiniz basariyla yapilmistir");
        }else {
            UserServiceTurkce userServiceTurkce= new UserServiceTurkce();
            userServiceTurkce.save();
        }

        return user;

    }
}

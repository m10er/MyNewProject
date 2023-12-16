package users;

public class UserServiceTurkce extends UserService {

    @Override
    void userName() {
        System.out.println("Lutfen eklemek istediginiz kullanicinin adini giriniz");
    }

    @Override
    void password() {
        System.out.println("Lutfen eklemek istediginiz kullanici sifrenizi giriniz");
    }

    @Override
    void registeredNameException() {
  System.out.println("sisteme kayitli kullanici adi.Lutfen farkli kullanici adi ile deneyiniz");
    }

    @Override
    void characterLessThen6Exception() {
        System.out.println("kullanici adi en az 6 karakter olmali");

    }

    @Override
    void userNameContainsSpace() {
        System.out.println("Kullanici adi bosluk iceremez");

    }

    @Override
    void passwordLessThen4Character() {
        System.out.println("sifreniz en az 4 karakterden olusmali");

    }

    @Override
    void passwordContainsSpace() {
        System.out.println("sifrenizde bosluk olamaz");

    }

    @Override
    void saveSuccess() {
        System.out.println("sisteme kaydiniz basariyla yapilmistir");

    }

    @Override
    void wrongValue() {
        System.out.println("Yanlis deger girdiniz");
    }
}

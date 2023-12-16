package users;

public class UserServiceDeutsch extends UserService {
    @Override
    void userName() {
        System.out.println("Bitte geben Sie den Namen des Benutzers ein, den Sie hinzufügen möchten.");

    }

    @Override
    void password() {
        System.out.println("Bitte geben Sie das Benutzerpasswort ein, das Sie hinzufügen möchten.");

    }

    @Override
    void registeredNameException() {
            System.out.println("Der im System registrierte Benutzername. Bitte versuchen Sie es mit einem anderen Benutzernamen.");

    }

    @Override
    void characterLessThen6Exception() {
        System.out.println("Der Benutzername muss mindestens 6 Zeichen lang sein");

    }

    @Override
    void userNameContainsSpace() {
        System.out.println("Der Benutzername enthält keine Leerzeichen");

    }

    @Override
    void passwordLessThen4Character() {
        System.out.println("Ihr Passwort muss aus mindestens 4 Zeichen bestehen.");

    }

    @Override
    void passwordContainsSpace() {
        System.out.println("Ihr Passwort darf keine Leerzeichen enthalten");

    }

    @Override
    void saveSuccess() {
        System.out.println("Ihre Registrierung im System wurde erfolgreich durchgeführt.");

    }

    @Override
    void wrongValue() {
        System.out.println("Falsche Werteingabe");
    }
}

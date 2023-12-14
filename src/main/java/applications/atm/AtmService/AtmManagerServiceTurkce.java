package applications.atm.AtmService;

import users.User;

import java.util.Scanner;

public class AtmManagerServiceTurkce implements  AtmManagerService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public void welcomeMessage() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" +
                "Team130 Bankasina hosgelidniz\n" +
                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public String tradingOptions() {
        System.out.println("1----Bakiye goruntuleme---------" +
                "\n2--------Para cekme------------- " +
                "\n3---------Para yatirma-----------\n" +
                "4-----------AnaProjeye gitmek icin-------------" +
                "\n5=======Projeden cikis yapmak icin=======");
        return scanner.next();
    }

    @Override
    public void balanceView(User user) {
        System.out.println("bakiyeniz =" + user.getAccaountBalance());
    }

    @Override
    public void withdrawMoney(User user) {
        System.out.println("Cekmek istediginiz tutari girin");
        double money = scanner.nextDouble();

        if (money > user.getAccaountBalance()) {
            System.out.println("Bakiyeniz yetersizdir");
        } else {
            user.setAccaountBalance(user.getAccaountBalance() - money);
            System.out.println("Para cekme islemi basariyla gerceklesmistir" +
                    "\nKalan bakiye=" + user.getAccaountBalance());
        }
    }

    @Override
    public void depositMoney(User user) {
        System.out.println("Yatirmak istediginiz tutari giriniz");
        double money = scanner.nextDouble();
        user.setAccaountBalance(user.getAccaountBalance() + money);
        System.out.println("yeni bakiyeniz" + user.getAccaountBalance());
    }

    @Override
    public void exit() {
        System.out.println("Atmden cikis yapildi.\nBizi tercih ettiginiz icin tesekkur ederiz");
    }

    @Override
    public void wrongChoice() {
        System.out.println("Yanlis secim.Lutfen tekrar deneyiniz");
    }

    @Override
    public int newChoice() {
        System.out.println("Atm menusune donmek icin 1'e;\n" +
                "Ana menu icin 2 ye" +
                "\nCikmak icin 0'a basiniz");
        return scanner.nextInt();
    }

}

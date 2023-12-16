package applications.atm.AtmService;


public class AtmManagerServiceTurkce extends AtmManagerService {


    @Override
    void atmWelcomeMessage() {
        System.out.println("Team130 Bankasina Hos geldiniz \n" +
                "            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    void tradingOptionMessage() {
        System.out.println("1----Bakiye goruntuleme---------" +
                "\n2--------Para cekme------------- " +
                "\n3---------Para yatirma-----------\n" +
                "4-----------AnaProjeye gitmek icin-------------" +
                "\n5=======Projeden cikis yapmak icin=======");
    }

    @Override
    void balanceMessage() {
        System.out.println("bakiyeniz =");
    }

    @Override
    void withDrawMoneyMessage() {
        System.out.println("Cekmek istediginiz tutari girin");
    }

    @Override
    void insufficientBalance() {
        System.out.println("Bakiyeniz yetersizdir");
    }

    @Override
    void successWithdrawmessage() {
        System.out.println("Para cekme islemi basariyla gerceklesmistir" +
                "\nKalan bakiye=");
    }

    @Override
    void exitMessage() {
        System.out.println("Atmden cikis yapildi.\nBizi tercih ettiginiz icin tesekkur ederiz");
    }

    @Override
    void wrongChoiceMessage() {
        System.out.println("Yanlis secim.Lutfen tekrar deneyiniz");
    }

    @Override
    void newChoiceMessage() {
        System.out.println("Atm menusune donmek icin 1'e;\n" +
                "Ana menu icin 2 ye" +
                "\nCikmak icin 0'a basiniz");
    }

    @Override
    void depositMoney1Message() {
        System.out.println("Yatirmak istediginiz tutari giriniz");
    }

    @Override
    void depositMoney2Message() {
        System.out.println("yeni bakiyeniz");
    }

}

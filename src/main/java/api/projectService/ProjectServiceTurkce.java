package api.projectService;


public class ProjectServiceTurkce extends ProjectService {

    @Override
    void projectOption() {
        System.out.println("Lutfen test etmek istedigniz projenin numarasini girin" +
                "\n1.Atm" +
                "\n2.Ideal Kilo " +
                "\n3.Burc tahmini " +
                "\n4.Dil degistirme" +
                "\n5.Cikis");
    }

    @Override
    void choicenew() {
        System.out.println("Ana menuye donmek icin 1'e;" +
                "\nCikmak icin 0'a basiniz");
    }

    @Override
    void quit() {
        System.out.println("Sistemden cikis yapildi.\nBizi tercih ettiginiz icin tesekkur ederiz");

    }

    @Override
    void choiceWrong() {

    }

    @Override
    void languageOption() {
        System.out.println("Ingilizce icin '1'\n" +
                "Almanca icin '2'\n" +
                "Turkce icin '3'");
    }

    @Override
    void languageException() {
        System.out.println("Hatali secim. Lutfen tekrar deneyiniz");
    }
}

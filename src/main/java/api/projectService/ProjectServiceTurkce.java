package api.projectService;

import java.util.Scanner;

public class ProjectServiceTurkce implements ProjectService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public String projectMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen test etmek istedigniz projenin numarasini girin" +
                "\n1.Atm" +
                "\n2.Ideal Kilo " +
                "\n3.Burc tahmini " +
                "\n4.Dil degistirme" +
                "\n5.Cikis");
        return   scanner.next();
    }

    @Override
    public int newChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ana menuye donmek icin 1'e;" +
                "\nCikmak icin 0'a basiniz");
        return scanner.nextInt();
    }

    @Override
    public void exit() {
        System.out.println("Sistemden cikis yapildi.\nBizi tercih ettiginiz icin tesekkur ederiz");
        System.exit(0);
    }

    @Override
    public void wrongChoice() {
        System.out.println("Yanlis secim.Lutfen tekrar deneyiniz");
    }

    @Override
    public String changeLanguage() {
        System.out.println("Ingilizce icin '1'\n" +
                "Almanca icin '2'\n" +
                "Turkce icin '3'");
        int choice=scanner.nextInt();
        String language="";
        if (choice==1){
            language="E";
        } else if (choice==2) {
            language="D";
        } else if (choice==3) {
            language="T";
        }else {
            System.out.println("Yanlis secim yaptiniz");
            changeLanguage();
        }

        return language;
    }
}

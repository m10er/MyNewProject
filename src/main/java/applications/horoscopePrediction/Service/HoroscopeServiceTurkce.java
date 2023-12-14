package applications.horoscopePrediction.Service;

import java.util.Arrays;
import java.util.Scanner;

public class HoroscopeServiceTurkce implements HoroscopeService{

    static Scanner scanner = new Scanner(System.in);
    @Override
    public void startHoroscopePrediction() {

        String[] kocBurcu = {"bencil", "dik kafali", "inatci", "kiskanc", "sabirsiz"};
        String[] bogaBurcu = {"agirkanli", "bencil", "dik kafali", "inatci", "kiskanc"};
        String[] ikizlerBurcu = {"dedikoducu", "dikatsiz", "kararsiz", "kurnaz", "sikilgan"};
        String[] yengecBurcu = {"daginik", "hayalci", "kaprisli", "supheci", "tembel"};
        String[] aslanBurcu = {"bencil", "elestiri sevmez", "inatcı", "Kaba", "musrif"};
        String[] basakBurcu = {"elestirmeyi seven", "detayci", "duzen hastasi", "tembel", "sivri dilli"};
        String[] teraziBurcu = {"duygusal", "gosterisli", "kararsiz", "kolay etkilenen", "lukse duskun"};
        String[] akrepBurcu = {"dik kafali", "kiskanc", "kindar", "kurnaz", "supheci"};
        String[] yayBurcu = {"dikkatsiz", "elestirmeyi seven", "kaprisli", "tembel", "umursamaz"};
        String[] oglakBurcu = {"duygusuz", "kotumser", "inatci", "riskten korkan", "sivri dilli"};
        String[] kovaBurcu = {"bencil", "dedikoducu", "dik kafali", "gosterisli", "ucuk kacik"};
        String[] balikburcu = {"alingan", "duygusal", "daginik", "dikatsiz", "supheci"};

        System.out.println("Bu verilen olumsuz ozelliklerden sizi digerlerinden daha dogru ifade eden bir ozelligi yaziniz");
        System.out.println("bencil,kurnaz,daginik, elestirmeyi seven, duygusal, duygusuz");
        String birinci = scanner.nextLine();
        System.out.println("dik kafali, dikkatsiz, hayalci, elestiri sevemez, detayci, lukse duskun, kotumser");
        String ikinci = scanner.nextLine();
        System.out.println("inatci, sikilgan, supheci, duzen hastasi, kolay etkilenen, umursamaz, ucuk kacik ");
        String ucuncu = scanner.nextLine();
        System.out.println("kiskanc, kararsiz, kaba, tembel, gosterisli");
        String dorduncu = scanner.nextLine();
        System.out.println("dedikoducu, sabirsiz, agirkanli, kaprisli, musrif, sivri dilli, riskten korkan, kindar");
        String besinci = scanner.nextLine();

        String[] arr = {birinci, ikinci, ucuncu, dorduncu, besinci};
        Arrays.sort(arr);
        Arrays.sort(kocBurcu);
        Arrays.sort(bogaBurcu);
        Arrays.sort(ikizlerBurcu);
        Arrays.sort(yengecBurcu);
        Arrays.sort(aslanBurcu);
        Arrays.sort(basakBurcu);
        Arrays.sort(teraziBurcu);
        Arrays.sort(akrepBurcu);
        Arrays.sort(yayBurcu);
        Arrays.sort(oglakBurcu);
        Arrays.sort(kovaBurcu);
        Arrays.sort(balikburcu);

        String sayackoc = "";
        String sayacboga = "";
        String sayacikizler = "";
        String sayacyengec = "";
        String sayacaslan = "";
        String sayacbasak = "";
        String sayacterazi = "";
        String sayacakrep = "";
        String sayacyay = "";
        String sayacoglak = "";
        String sayackova = "";
        String sayacbalik = "";


        for (int i = 0; i < arr.length; i++) {
            if (Arrays.binarySearch(kocBurcu, arr[i]) >= 0) {
                sayackoc = sayackoc.concat("*");

            }
            if (Arrays.binarySearch(bogaBurcu, arr[i]) >= 0) {
                sayacboga = sayacboga.concat("*");

            }
            if (Arrays.binarySearch(ikizlerBurcu, arr[i]) >= 0) {
                sayacikizler = sayacikizler.concat("*");
            }
            if (Arrays.binarySearch(yengecBurcu, arr[i]) >= 0) {
                sayacyengec = sayacyengec.concat("*");

            }
            if (Arrays.binarySearch(aslanBurcu, arr[i]) >= 0) {
                sayacaslan = sayacaslan.concat("*");

            }
            if (Arrays.binarySearch(basakBurcu, arr[i]) >= 0) {
                sayacbasak = sayacbasak.concat("*");

            }
            if (Arrays.binarySearch(teraziBurcu, arr[i]) >= 0) {
                sayacterazi = sayacterazi.concat("*");

            }
            if (Arrays.binarySearch(akrepBurcu, arr[i]) >= 0) {
                sayacakrep = sayacakrep.concat("*");

            }
            if (Arrays.binarySearch(yayBurcu, arr[i]) >= 0) {
                sayacyay = sayacyay.concat("*");

            }
            if (Arrays.binarySearch(oglakBurcu, arr[i]) >= 0) {
                sayacoglak = sayacoglak.concat("*");

            }
            if (Arrays.binarySearch(kovaBurcu, arr[i]) >= 0) {
                sayackova = sayackova.concat("*");

            }
            if (Arrays.binarySearch(balikburcu, arr[i]) >= 0) {
                sayacbalik = sayacbalik.concat("*");

            }
        }
        System.out.println(" koc burcu olma ihtimaliniz :" + sayackoc);
        System.out.println(" boga burcu olma ihtimaliniz :" + sayacboga);
        System.out.println(" ikizler burcu olma ihtimaliniz :" + sayacikizler);
        System.out.println(" yengec burcu olma ihtimaliniz :" + sayacyengec);
        System.out.println(" aslan burcu olma ihtimaliniz :" + sayacaslan);
        System.out.println(" basak burcu olma ihtimaliniz :" + sayacbasak);
        System.out.println(" terazi burcu olma ihtimaliniz :" + sayacterazi);
        System.out.println(" akrep burcu olma ihtimaliniz :" + sayacakrep);
        System.out.println(" yay burcu olma ihtimaliniz :" + sayacyay);
        System.out.println(" oglak burcu olma ihtimaliniz :" + sayacoglak);
        System.out.println(" kova burcu olma ihtimaliniz :" + sayackova);
        System.out.println(" balik burcu olma ihtimaliniz :" + sayacbalik);
    }
}

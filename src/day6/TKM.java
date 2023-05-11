package day6;

import java.util.Random;
import java.util.Scanner;

public class TKM {

    // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
    // Kural: 5 puana ilk ulasan oyunu kazanir

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tas icin 1, kagit icin 2 makas icin 3 seciniz");

        Random random = new Random();

        int bilPuan = 0;
        int senPuan = 0;
        int secim=0;
        int bil=0;

        do {
            System.out.println("Lutfen secim yapiniz\n1-tas \n2-kagit \n3-makas");
            secim = scanner.nextInt();
            bil = random.nextInt(3)+1;

            if (secim == 1 && bil == 2 ) {

                    System.out.println(" bilgisayarin secyigi: "+ bil);
                    System.out.println("");
                    System.out.println("kagit tasi sarar--- Bilgisayar kazandi");
                    bilPuan++;
                    System.out.println("sizin puanininz:"+senPuan+"\nbilgisayarin puani:"+bilPuan);
                    System.out.println("");

            } else if (secim == 1 && bil == 3) {
                System.out.println(" bilgisayarin secyigi: " + bil);
                System.out.println("");
                System.out.println("tas makasi ezer--- Sen kazandin");
                senPuan++;
                System.out.println("sizin puanininz:" + senPuan + "\nbilgisayarin puani:" + bilPuan);
                System.out.println("");

            } else if (secim == 2 && bil == 1) {
                System.out.println(" bilgisayarin secyigi: " + bil);
                System.out.println("");
                System.out.println("kagit tasi sarar--- Sen kazandin");
                senPuan++;
                System.out.println("sizin puanininz:" + senPuan + "\nbilgisayarin puani:" + bilPuan);
                System.out.println("");

            } else if (secim == 2 && bil == 3) {
                System.out.println(" bilgisayarin secyigi: "+ bil);
                System.out.println("");
                System.out.println("makas kagiti keser--- Bilgisayar kazandi");
                bilPuan++;
                System.out.println("sizin puanininz:"+senPuan+"\nbilgisayarin puani:"+bilPuan);
                System.out.println("");

            } else if (secim == 3 && bil == 2) {
                System.out.println(" bilgisayarin secyigi: " + bil);
                System.out.println("");
                System.out.println("makas kagiti keser--- Sen kazandin");
                senPuan++;
                System.out.println("sizin puanininz:" + senPuan + "\nbilgisayarin puani:" + bilPuan);
                System.out.println("");

            } else if (secim == 3&& bil == 1) {
                System.out.println(" bilgisayarin secyigi: "+ bil);
                System.out.println("");
                System.out.println("tas makasi ezer--- Bilgisayar kazandi");
                bilPuan++;
                System.out.println("sizin puanininz:"+senPuan+"\nbilgisayarin puani:"+bilPuan);
                System.out.println("");

            }else {
                System.out.println("Bilgisayar sizinle ayni seyi secti kimse puan alamadi ");
                System.out.println("sizin puanininz:"+senPuan+"\nbilgisayarin puani:"+bilPuan);
                System.out.println("");
            }
        } while (bilPuan != 5 && senPuan != 5);
        if (senPuan>bilPuan){
            System.out.println("tebrikler siz kazandiniz");
        }else System.out.println("maalesef kaybettiniz");
    }
}







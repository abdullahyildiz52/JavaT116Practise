package day6;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

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

            if (secim == 1) {
                if (bil == 2) {
                    System.out.println("kaybettiniz bilgisayar kagit ile kazandi KAYBETTINIZ");
                    bilPuan++;
                    break;

                } else if (bil == 3) {
                    System.out.println("bilgisayar makas girdi, KAZANDINIZ !!! ");
                    senPuan++;
                    break;

                } else System.out.println("BERABERE");

            } else if (secim == 2) {
                if (bil == 1) {
                    System.out.println("bilgisayar tas girdi, KAZANDINIZ !!! ");
                    senPuan++;
                    break;
                } else if (bil == 3) {
                    System.out.println("bilgisayar makas girdi, KAYBETTINIZ ");
                    bilPuan++;
                    break;

                } else System.out.println("BERABERE");


            } else if (secim == 3) {
                if (bil == 1) {
                    System.out.println("bilgisayar tas girdi, KAYBETTINIZ ");
                    bilPuan++;
                    break;
                } else if (bil == 2) {
                    System.out.println("bilgisayar kagit girdi KAZANDINIZ !!!");
                    senPuan++;
                    break;

                } else System.out.println("BERABERE");


            } else continue;
        } while (bilPuan == 5 || senPuan == 5);



           /* if (bilPuan == 5) {
                System.out.println("Bilgisayar Kazandi");

            } else if (senPuan == 5) {
                System.out.println("Kazandiniz");

            }
           */

        System.out.println("Bilgisayarin puani: " + bilPuan);
        System.out.println("Senin Puanin : " + senPuan);


    }
}







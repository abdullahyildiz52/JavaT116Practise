package day6;

import java.util.Scanner;

public class WiseMarket {
    /*
     ==================== WISE MARKET KASA PROGRAMI ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
    */
    public static void main(String[] args) {
        String sarkuteri=("sucuk: 190 TL\nkiyma: 240 TL\ntavuk: 80 TL\npastirma: 400 TL");

        String manav=("sogan: 19 TL\nkiraz: 40 TL\npatates: 20 TL\npirasa: 15 TL");

        String market=(" soda: 15 TL\nkekik: 40 TL\npirinc: 20 TL\npeynir: 150 TL");

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen bir secim yapiniz: \n==================WISE MARKET KASA PROGRAMI=========" +
                "===========\n1\tSARKUTERI URUNLERI\n2\tMANAV URUNLERI\n3\tMARKET");

        int secim=scanner.nextInt();
        if (secim==1){
            System.out.println(sarkuteri);
        }else if (secim==2){
            System.out.println(manav);
        }
        else if (secim==3){
            System.out.println(market);
        }
        else System.out.println("gecerli bir secim yapiniz");

    }
}


package day6;

import java.util.Scanner;

public class AdamAsmaca {
    /*
Bu programda, kelimeler adlı bir kelime listesi oluşturulacak.
Ardından, bu listeden rastgele bir kelime seçmek için Math.random() fonksiyonu kullanılmıştır.
Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] kelimeler={"java","programlama","fonksiyon","yazilim","degisken","kodlama"};
        String secilenKelime=kelimeler[(int) Math.random()* kelimeler.length];
        int kelimelength=secilenKelime.length();
        System.out.println("lutfen bir harf girip enter tuusuna basiniz");
        int can=5;
        String[] tahminEdilenHarfler=new String[secilenKelime.length()];
        for (int i = 0; i <tahminEdilenHarfler.length ; i++) {
            tahminEdilenHarfler[i] = "-";

        while (can>0);

        }

    }
}

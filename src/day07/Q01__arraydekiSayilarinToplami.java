package day07;

public class Q01__arraydekiSayilarinToplami {
    /*
    Create an array of 5 floats and calculate their sum
     */
    public static void main(String[] args) {

    float[] numbers={5.1f,3.0f,4.3f,5.6f,6.8f};
    float toplam=0;
        System.out.println("========For loop cozumu");
        for (int i = 0; i <numbers.length ; i++) {
            toplam+=numbers[i];

        }
        System.out.println("Toplam for Loop ile:"+toplam);
        System.out.println("========While loop cozumu");
        toplam=0;
        int i=0;
        while (i<numbers.length){
            toplam+=numbers[i];

            i++;
        }
        System.out.println("toplam while loop ile: "+toplam);

        System.out.println("Toplam while loop ile azalan cozumu");

        toplam=0;
        int j=numbers.length-1;
        while (j>=0){
            toplam+=numbers[j];

            j--;
        }
        System.out.println("Toplam azalan While loop ile:  "+toplam);


    }
}

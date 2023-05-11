package day07;

public class Q02_YemekMultiDimArray {
    // create 2D array of food:
    // print all the foods sorted
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */
    public static void main(String[] args) {
        String [][] food = {{"steak", "hot dog", "cheeseburger"},{"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] each:food
             ) {
            for (String yemek:each
                 ) {
                System.out.println(yemek);

            }
            System.out.println("==========================");

        }
    }
}

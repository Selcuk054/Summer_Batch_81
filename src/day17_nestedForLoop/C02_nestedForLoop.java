package day17_nestedForLoop;

public class C02_nestedForLoop {
    public static void main(String[] args) {
        //Verilen sayiya gore carpim tablosu olusturun.
        /* input 3 ise
        1 2 3
        2 4 6
        3 6 9
         */
        int input=4;

        for (int i =1 ; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}

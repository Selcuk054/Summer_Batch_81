package day15_overloadingForLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5, 7); //12
        topla(5.2,3); //8.2
        topla(3.4,5.7); //9.1
    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }

    /* Bir class da Parametre turleri ve prametre sayilari ayni olan 2 method olusturamayiz.
    public static void topla(int sayi1, int sayi2){

         System.out.println("iki integer in toplami :"+ (sayi1+sayi2));
 */
    public static void topla(double sayi1, int sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }


    public static void topla(int sayi1, double sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }
}
package day15_Overloading_ForLoop;

public class C04_Overloading {

    public static void main(String[] args) {

        topla(5, 7); //12
        topla(5.2,3); //8.2
        topla(3.4,5.7); //9.1
        topla(5,6.2); // 11.2
    }
    /* Java hamgi methodun calisacagina karar verirken optimizasyon yapar
    eger hic cast yapmadan kullanabilecegi method varsa onu kullanir eger
    cast yapmadan kullanacagi bir method yoksa , en az cast yaparak kullanabilecegi methodu
    tercih eder.
     */

    public static void topla(int sayi1, int sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }
    public static void topla(double sayi1, int sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }

    // burdaki methodu sildik.


    public static void topla(double sayi1, double sayi2) {

        System.out.println("iki integer in toplami :" + (sayi1 + sayi2));
    }
}

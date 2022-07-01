package day04_Datacasting;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1= 10;
        int sayi2= sayi1 +1 ;  // sayi2--> 11
        sayi2 +=5; // sayi2-->16
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */
        int sayi3 = sayi2++;    // 1- sayi2 bir artirilacak
        // 2- sayi2 degeri, sayi3'e atanacak
        int sayi4=++sayi1;      // 1- sayi1 bir artirilacak
        // 2- sayi1 degeri, sayi4'e atanacak
        System.out.println(sayi4);

        int sayi5 = sayi2--;
        System.out.println(sayi5);
    }
}

package day31_timeFormatter_varargs;

public class C02_Varargs {

    public static void main(String[] args) {
        //verilen iki ineger i toplayip bir method olusturun.

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1, sayi2, sayi3);



    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("Verilen uc sayinin toplami : "+ (sayi1+sayi2+sayi3));
    }

    public static void ToplaYazdir(int sayi1, int sayi2) {

        System.out.println("Verilen iki sayinin toplami : "+ (sayi1+sayi2));
    }
}

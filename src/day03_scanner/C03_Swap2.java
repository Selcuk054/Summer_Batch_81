package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin
        //Sayi1=10;  sayi2=20
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi2-sayi1;
        sayi1=sayi1+sayi2;
        System.out.println("Sayi 1 :"+sayi1);
        System.out.println("Sayi 2 :"+sayi2);
    }
}
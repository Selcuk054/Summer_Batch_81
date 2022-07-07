package day15_overloadingForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip sonucu bize donduren bir method yapalim.

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);


    }

    public static int carpGetir(int sayi1, int sayi2) {

        return sayi1*sayi2;
    }
}

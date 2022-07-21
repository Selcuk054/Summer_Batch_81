package day28_staticBlock;

public class C01_staticBlock {

    static int sayi;
    static{
        /*
        Static blok class uyelerinin tamamindn once calisir
        (Main methoddan bile once)
        Static block class olustutuldugunda calisir genellikle de class la ilgili
        on ayarlamalar veta static variable lara deger atamak icin kullanilir.

        Static block larin class icerisinde nerede oldugu onemli degildir. once static blocklar calisir.
        Birden fazla static block varsa yukaridan asagi dogru calisir.

         */
        System.out.println("static blok calisti");
        sayi=10;

    }


    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

    }
    static{
        System.out.println("Main method altindaki static block calisti");
    }

}

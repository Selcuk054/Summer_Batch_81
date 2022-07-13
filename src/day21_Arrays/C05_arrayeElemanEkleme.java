package day21_Arrays;

import java.util.Arrays;

public class C05_arrayeElemanEkleme {
    public static void main(String[] args) {
        //C05 deki mathodu kullanarak array e eleman ekleyelim

        String [] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";

        takimListesi= C06_ArrayeElemetEkleme.elemanEkle(takimListesi, eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));

    }
}

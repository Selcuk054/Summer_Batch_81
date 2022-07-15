package day23_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort metodunda siralama ozelligini girmek geekiyor bunun yerine
        collections class indan sort metodunu kullaniyoruz bu method listemizi natural order a gore siralar.

         */

    }
}

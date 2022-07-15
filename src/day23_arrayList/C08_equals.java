package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        List<String> urunler2=new ArrayList<>();
        urunler2.add("Cekirdek");
        urunler2.add("Cay");
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        System.out.println(urunler.equals(urunler2)); //false

        Collections.sort(urunler);
        Collections.sort(urunler2);
        System.out.println(urunler.equals(urunler2));//true





    }
}

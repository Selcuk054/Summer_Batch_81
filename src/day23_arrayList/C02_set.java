package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimzde urunlerin bulundugu bir liste var urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip eski urunu var olan eski urunler listesine ekleyelim.
         */

       List<String> urunler=new ArrayList<>();

       urunler.add("Nutella");
       urunler.add("Ikram");
       urunler.add("Cekirdek");
       urunler.add("Cay");

       List<String> eskiUrunler=new ArrayList<>();

       // listedeki


       String yeniurun="Biskrem";
       String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenurun=urunler.set(temp,yeniurun);

        eskiUrunler.add(silinenurun);
        System.out.println("Liste :"+urunler);
        System.out.println("eski urunler listesi :"+eskiUrunler);


        yeniurun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);
        silinenurun=urunler.set(temp,yeniurun);

        eskiUrunler.add(silinenurun);
        System.out.println("Liste :"+urunler);
        System.out.println("eski urunler listesi :"+eskiUrunler);

        yeniurun="Fistik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenurun=urunler.set(temp,yeniurun);

        eskiUrunler.add(silinenurun);
        System.out.println("Liste :"+urunler);
        System.out.println("eski urunler listesi :"+eskiUrunler);


    }
}

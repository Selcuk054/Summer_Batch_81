package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        //Value lari sira numarali olarak yazdirin.
        ReusableMethods.tumValueSiraliYAzdir(ogrenciMap);


        //Isim ve soy isimlerin birlikte olacagi bir liste olusturun
        List<String> sinifIsimSoyisim=ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("Isim Soysisim Listesi :"+sinifIsimSoyisim);


        //Kac farkli brans varsa brans ismi: bransdaki ogrenci sayisi seklinde yazdiririn.
    }
}

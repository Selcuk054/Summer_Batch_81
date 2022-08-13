package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        //Verilen bir Stringdeki kullanilan harfleri ve kullanilan harflerin ekrar sayisini
        //H=20 seklinde yazdirin.

        String str= "Heeeeellllooooo Woooorrrrllllllddddd";
        //String [] harflerArr=str.split("");

       // System.out.println(Arrays.toString(harflerArr));

        //Space leri ve noktalari saymamasi icin onlari yok edelim

        str=str.replaceAll("\\W","");
        String [] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        //harfleri key, kullanim adedini value yaparak bir mak olusturalim.

        Map<String,Integer> harfKullanimSayilariMap=new HashMap<>(); //hashMap yerine tree map kullanirsak alfabetik siraya gore siralayip yapar.
        Integer harfKullanimSayisi;
        for (String each: harflerArr){
            if (!harfKullanimSayilariMap.containsKey(each)){
                harfKullanimSayilariMap.put(each,1);
            }else{
                harfKullanimSayisi=harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each,++harfKullanimSayisi);
            }
        }
        System.out.println(harfKullanimSayilariMap);






    }
}

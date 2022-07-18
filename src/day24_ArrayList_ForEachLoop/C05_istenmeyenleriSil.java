package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_istenmeyenleriSil {
    // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin
    public static void main(String[] args) {
        String [] sehirler={"Istanbul","Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenharf="a";
        List<String> kalanlar=new ArrayList<>();
        for (int i = 0; i <sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenharf)){
                kalanlar.add(sehirler[i]);

            }
        }
        //Loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak
        System.out.println(kalanlar);

        //yeni bir Array olusturup ,listeyi ona aktaralim.
        String[] kalanlarArrayi=new String[kalanlar.size()];

        for (int i = 0; i <kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);


        }
        //sehirler array inin yeni degerini atayalim
        sehirler=kalanlarArrayi;

        System.out.println("Sehiler Arrayinin son hali :"+ Arrays.toString(sehirler));
    }
}

package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre Java");
        sinifList.put(104, "Derya, Deniz, Devops");
        sinifList.put(105,"Ali, Can, JDev");
        sinifList.put(106, "Enes, Cem, Tester");
        sinifList.put(107, "Taha, Emre Java");
        sinifList.put(108, "Derya, Deniz, Tester");

        System.out.println(sinifList);
        //{101=Ali, Can, JDeveloper, 102=Enes, Cem, Tester, 103=Taha, Emre Java, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali, Can, JDeveloper, Enes, Cem, Tester, Taha, Emre Java, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size()); //4

        //Tum ogrecilerin bilgilerini alt alta yazdirin
        Collection<String> tumValueColl=sinifList.values();

        String[] eachArr;
        int sira=1;

        for (String each :tumValueColl){
            // Burada eachr bize bir ogrenciye ait ayni yapidaki sisim,soyisim,brans
            //bilgilerini iceren String'ler getiriyor.

            eachArr=each.split(", ");

            System.out.println(sira + "- "+ eachArr[0] + " "+ eachArr[1]); //sadece isim soyisimleri cektik
            sira++;

        }
        //Map de bulunan ogrencilerin isim ve soyisimlerini birlestirerek birsinif
        //listesi olustururunuz

        List<String> sinifISimSoyisimLIst=new ArrayList<>();
        for(String each : tumValueColl
        ){
            eachArr=each.split(", ");
            sinifISimSoyisimLIst.add(eachArr[0]+" "+eachArr[1]);

        }
        System.out.println(sinifISimSoyisimLIst);


    }
}

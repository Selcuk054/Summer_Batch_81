package day46_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){

        Map<Integer,String> sinifMap = new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDeveloper");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre Java");
        sinifMap.put(104, "Derya, Deniz, Tester");


        return sinifMap;

    }


    public static void tumValueSiraliYAzdir(Map<Integer, String> ogrenciMap) {

        int sira=1;
        for (String eacht : ogrenciMap.values()){
            System.out.println(sira+ " - "+ eacht);
            sira++;
        }

    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList=new ArrayList<>();
        String[] eachArr;
        for(String each : ogrenciMap.values()){

            eachArr=each.split(", ");
            methoddakiList.add(eachArr[0]+" "+eachArr[1]);

        }
        return methoddakiList;

    }
}

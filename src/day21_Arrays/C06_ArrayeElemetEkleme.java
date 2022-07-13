package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemetEkleme {

    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */
        String [] sinifListesi={"Alican","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));


    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi=new String[sinifListesi.length+1];
        //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //oncelikle eski listedeki tum elemanlari, yeni isteye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

        //son index e ise eklenecek ismi atadim



        return yeniSinifListesi;
    }
}

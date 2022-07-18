package day24_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapma {
    public static void main(String[] args) {

        String[] arr={"Ismail","Nurllah","Fatih"};

        /*
        Uzun listeler olustrmamiz gerektiginde tek tek eklemek yerine
        Array olusturup bunlari liste cevirmek daha pratik olabilir.
         1- loop ile arraydeki tum elementleri list e atabiliriz.
         2-Arrays.aslist() kullanabiliriz.
            ancak bu metodun iki tane kotu yan tesiri var
            - Arrays class i kullanildigi icin array ozellikleri gecerli olur.
            dolayisiyla list te olan add, remove gibi size i degistiren methodlat bu sekilde
            olusturulan listlerde kullanilamaz.
            - Kaynak olan array ile urun olan list ozdeslestirilir.
            birinde yapilan degisiklik otomatik olarak digerinede islenir.

         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList); //[Ismail, Nurllah, Fatih]

        //1. yan etki
       // sinifList.add(("Erdi")); //UnsupportedOperationException- desteklenmeyen operation

       // sinifList.remove(1); //UnsupportedOperationException- desteklenmeyen operator.

        //2. yanetki
        arr[1]="Emre";
        System.out.println("Degisim sonrasi array :"+Arrays.toString(arr));
        System.out.println("Array i degistirince list :" + sinifList);

        sinifList.set(0,"Utku");
        System.out.println("List i degistirince list :"+sinifList);
        System.out.println("List i degistirince Array :"+ Arrays.toString(arr));





    }
}

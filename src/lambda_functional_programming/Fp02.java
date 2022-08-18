package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
    /*
    1-   t-> "Logic" (t,u)-> "Logic"
    Bu yapiya "Lambda expression"
    2-  Functional Programming kapsaminda Lambda Expression kullanilabilir ama onerilmez.
    "Lambda expression" yerine "Method Referance" tercih edilir
    3- "Method Referance" kullanimi  "Class Name :: Method Name"

        Ayni zamanda kendi class larinizi da kullanabilirsiniz.
        Ornegin; bir Animal class iniz var ve u class "eat()" methoduna sahip ==>> "Animal :: eat"
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);

        listElemanlariniYazdirFunctional(list);
        System.out.println();
        ciftElemanlariYazdirFunctional(list);
        System.out.println();
        tekElemanlarinKareleriniYazdir(list);
        System.out.println();
        tekrarsizTekElemanlarinKupunuAl(list);

    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir
    // method oluşturun.(Functional ve method reference)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
   // 2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuAl(List<Integer>list){

        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }



}

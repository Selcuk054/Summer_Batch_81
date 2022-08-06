package day42_abstract_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    /*
    Interface bir class degildir

    Abstact classlar javada abstraction (yani soyutlastirma/kural koyma) islevini yapiyordu
    Ancak abstract bir class da abstract olmayan methodlarda olabilir.Bu da full abstraction yapmaya izin vermez

    Eger java da icinde hic concrete method olmasin dedigimiz bir class olusturmak istiyorsniz bunu class degil
    interface yapmalisiniz

    1- &&&&  INTERFACE ler de concrete methode olmaz &&&

    2- Interface ler full abstraction yaptigindan interfacelerden obje olusturulamaz

    Hatirladiginiz gibi listten direkt obje olusturamiyorduk

     List<String> liste=new List<>();  calismaz

     Bunun yerine constructor u list in child i olan ArrayListten seceriz
     List<String> liste=new ArrayList<>();

     3- Classlarda bir child birden fazla parent edinemez.
     Ancak interface lerde concrete method olmadigindan biz her method u child class da override etmek zorundayiz
     Override ederken kimiin soyledigini override ettigimizin onemi yok.

     4- Interfaceler neyiin yapilmasi gerektigini soyler ama nasil nasil yapilacagina karismaz.


     */
    int SAYI=30;

    String ISIM="Yildiz Kolaji";



}

package day35_inheritancedaConstructorKullanimi;

public class AChild extends AParent{

    String isim="Child isim belirtilmedi";
    AChild (){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();

        //Bu objeyi olusturmak icin grandPa constructor calisir,
        //Parent veya constructor calismaz

        AChild child1=new AChild();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        //Child 1 objesi icin Child constructor u calisir.
        /*
        Javada bir class i kullanabilmek icin o class dan obje olusturur,
        dolayisiyla o class in constructor ini kullanirdirk


        Java inheritence da parent class lardaki ozellikleri
        kullanabilmek icin o class larin
        constructorlarini otomatik calistiran bir yapi kurmustur.

        Ornegin biz child classinda Child class indan bir obje olusturmak istedigimizde
        child constructor unu kullaniriz.

        Java Child constructorunu gordugunde once parent in constructorunu calistirmam lazim der.
        Buradan parent constructor a gider. Parent class inda Parent constructorunu gorunce once unu parent inin
        yani grandparent constructor calismasi gerekir der.

        Boylece extends keyword olmayan class akadar gider ve oradan baslayarak tum constructor lari asagi dogru calistirir.


         */


    }
}

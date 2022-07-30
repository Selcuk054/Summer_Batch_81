package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class da gorunmese bile bir constructor vardir
    Bu class dan obje olusturmak istedigimizde default constructor devreye girecektir.

    Default constructor u gozlemleyemeyecegimiz icin onu yerine kullanilabilecek
    parametresiz constructor olusturalim.
     */

    protected String grandpaKlupAdi="Grandpa Klubu";

    AGrandParent (){
        System.out.println("Grandpa constructor calisti");

    }



}

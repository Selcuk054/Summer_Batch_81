package day35_inheritancedaConstructorKullanimi;

public class AParent extends AGrandParent {
    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent Klubu";

    AParent(){
        System.out.println("Parent constructor calisti");
    }
}

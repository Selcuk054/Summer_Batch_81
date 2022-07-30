package day35_inheritancedaConstructorKullanimi;

public class DOgretmen {
    DOgretmen(){


        System.out.println("Ogretmen Parametresiz constructor");
    }
    DOgretmen(String isim){

        this();

        System.out.println("Ogretmen Parametreli constructor");
    }
}

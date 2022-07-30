package day35_inheritancedaConstructorKullanimi;

public class CCorolla extends CToyota{
    CCorolla (){

        System.out.println("Corolla Parametresiz Constructor");
    }
    CCorolla (String isim){

        super(isim);
        System.out.println("Corolla Parametreli Constructor");
    }
}

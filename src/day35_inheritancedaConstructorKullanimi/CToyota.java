package day35_inheritancedaConstructorKullanimi;

public class CToyota {

    CToyota (){

        System.out.println("Toyota Parametresiz Constructor");
    }

    CToyota (String isim){
        //super(isim);  extends olmadigi icin super constructor call i java kabul etmez.
        System.out.println("Toyota Parametreli Constructor");
    }

}

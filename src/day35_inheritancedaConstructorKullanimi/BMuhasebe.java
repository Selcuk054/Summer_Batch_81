package day35_inheritancedaConstructorKullanimi;

public class BMuhasebe extends BPersonel{

    BMuhasebe (){
        System.out.println("Muhasebe Parametresiz Constructor");
    }
    BMuhasebe (String isim){
        System.out.println("Muhasebe Parametreli Constructor");
    }


}

package day37_overridding;

public class DAraba {


    private void yakit(){
        System.out.println("Tum arabalar yaki kullanir");
        /*
        Parent class dan override edilmesini istemediginiz methodlari private static veya final yapabilirsiniz.
         */
    }

    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }
    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }

}

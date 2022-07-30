package day35_inheritancedaConstructorKullanimi;

public class DMatematikciler extends DOgretmen{

    DMatematikciler(){

        System.out.println("Matematikciler Parametresiz constructor");
    }
    DMatematikciler(String isim){
        this();
        System.out.println("Matematikciler Parametreli constructor");
    }

    public static void main(String[] args) {
        DMatematikciler obj1=new DMatematikciler("Tugba");
    }
    /*
    thid()constructor call icinde bulunulan class daki
    constructordlari super() iseparent class da bulunan constructorlari
    cagirir

    this veya super parametre yapisina uygun bir constructor
    Java CTE verir.

    Constructor konusunda gordugumuz this.
    o class daki iinstance variable lari refere ediyordu.

    inheritance dada super. vardir
    super. parent class daki instance lari refere eder.

     */

}

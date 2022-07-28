package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable ina ulasabildim
        // degistirebildim(set etmek) ve yazdirabildim(get etmek.
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //acces modifier kullanrak marka variable ina ulasimi tamamen
        //serbest yapabilir yada tamamen engelleyebilirim.
        //private yaptigimiz modele ulasamayiz.
        // Yani acces modifier ya hep ya hic diyor.

        // Markayi degistirelim ama goremeyelim
        //yakiida gorelim ama degistiremeyelim

        /* set ve get yetkilerini ozel olarak tanimlamak isterseniz
           1. adim ozel yetki tanimlayacaginiz variable lari private yapin.
              private bir data ya baska class lardan ulasmak mumkun degil olmadigindan
           2. adim Set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim


         */

        arb1.setModel("Supra"); //model olarak supra atadik
        // modeli yazdirma imkanimiz yok cunku getter yok.
        System.out.println(arb1.getYakit());// elektrikli bilgisini yazdirabildik.
        // yakiti degistiremeyiz cunku setter methodu yok.




    }
}

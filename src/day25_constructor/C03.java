package day25_constructor;

public class C03 {
    /*
    proje olustururken bazi classlardan run etmek icin degil
    variable ve method olusturup
    bunlari baska class lardan kullanmak icin kullanilir
     */
    /*
    Default constructor parametresizdir goremesek
    bile ihtiyac oldugunda calisir.

     Class icerisinde parametreli veya parametresiz herhangi bir
     contructor olusturursak java default constructor u siler.

     */



      C03(){

      }
/*
olusturdugumuz parametresiz bu constructor defoult constructor
ile birebir aynidir. Ama biz olusturdugumuz icin buna default contractur demeyiz
parametresiz contructor deriz.
 */

      String isim= "Etka";
      public void method01(){
      System.out.println("C03 method calisti");
}

}


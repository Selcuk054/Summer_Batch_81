package day42_abstract_Interface;

import day25_constructor.C01;

public interface I03_Interfaces {

    int SAYI=20;

  /*  int sayi;
      interfacelerde tum variable lar public static ve final dir. dolayisiyla sonradan deger atama sansimiz yoktur
      bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz.

      Bir interface bir class i parent ednemez
   */
    void yakit();
    /*
    Interface icerisinde her method public ve abstract  ozelliklere sahiptir

    Abstract bir methodun body si olmasi mumkun degildir. Java sonradan developerlarin istegi uzerine
    kismi bir update yapmistir.
    Bir interface e sonradan bir abstract method eklerseniz o interface de dah once implement etmis tum classlara gidip
    hepsinde yeni eklenen methodu override etmeniz gerekir Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir'

    Bunun icinJava JAva8 den itibaren interface lere sonradan body si olan method eklenmesine izin vermistir

    Bu methodlarin body si olsa da Interface in yapsisi geregi bu methodlara concrete denmez.
    Body si olan bu methodlar istisna olarak kabul edilebilir.

     */


    public void motor();
    public abstract void teker();


}

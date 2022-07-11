package day19_scope;

public class C02_staticVariables {


   static int staticSayi=10;
   String isim="mehmet";

   static int degersizStaticVar;
   int degersizInstanceVariable;
   /*
   Class level daki variable lara deger atamasakda java akbul ediyor..
    */

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa objeler icin degil class icin gecerlidir.
         */



        System.out.println(staticSayi);// 10
        staticMethod(); //10

        staticSayi=12;
        System.out.println(staticSayi); // 12
        C02_staticVariables obje1=new C02_staticVariables();
        obje1.staticOlmayanMethod(); //12
        //En son statik olmayav method icerisinde static variable a20 degeri atandigi icin
       // alttaki yazdirma isleminin sonucu 20 olarak cikmistir.
        System.out.println(staticSayi);//20
        /*
        Instance bir variable nin degerini bulmak icin objenin olusturulmasindan itibaren istenen satira kadar kodu
        takip etmeliyiz. Static variable da ise class in enbasindan baslayarak istenen satira kadar
        kodu takip edip static variablein son degerini bulmamiz gerekir
         */

    }


    public static void staticMethod(){
        System.out.println(staticSayi); //


    }


    public void staticOlmayanMethod(){

        /*
        static variable lar class icerisinden heryerden uasilabilir
        static olsun veya olmasin tum methodlar static
        variables lari gorebilir ve degistirebilirler.
        Farkli methodlarda static variable in hangi degeri alacagini bilmek istiyorsak
        class in basindan itibaren kodun caismasini takip etmeliyiz.
        Method nezaman cagirilirsa o anki static variable degerini methodda kullanabiliriz.
         */
        System.out.println(staticSayi);
        staticSayi=20;

    }
}

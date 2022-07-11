package day19_scope;

public class C03_classVariables {
    public static void main(String[] args) {

        /*
        Farkli bir class da calisirken herhangi bir class adini yazip noktaya basarsak
        adini yazdigimiz class daki tum static class uyelerni gorebilir ve kullanabiliriz.
         */
        C02_staticVariables.staticMethod(); // 10
        System.out.println(C02_staticVariables.staticSayi); //10
        System.out.println(C02_staticVariables.degersizStaticVar);
        /*
        Class level variable lara deger atayip atamamamk bize kalmistir istersek
        deger atamasi yapariz istemezsek atama yapmayiz
        eger dger atamissak java atadigimiz o degeri kabul eder. deger atamazsak
        jaa bu variable lara defoult bir deger atamasi yapar.
        int--> 0
        String--> null
        boolean-->false
        char--> '' (hiclik)
        */


        /*
        Baska class daki instance variable lara obje olusturarak ulasabiliriz.

         */

        C02_staticVariables obje1=new C02_staticVariables();//10
        obje1.staticOlmayanMethod(); //10
        // bu method icinde static sayi 20 oldu.
        System.out.println( obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVariable);//0


        System.out.println(C02_staticVariables.staticSayi);// 20

        /*
        Farkli bir classdan c02 clasindan metod ve variablelari kullandigimda
        C02 class inin tamami degil sadece benim cagirdigim kisim class uyeleri calisir.
         */


      //  System.out.println(C02_staticVariables.main()); ? sorulabilir.




    }
}

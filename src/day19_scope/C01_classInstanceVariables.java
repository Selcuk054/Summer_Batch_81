package day19_scope;

public class C01_classInstanceVariables {

    /*
    Class icinde heryerden kullanmak istediginiz variable lari
    class level'da (classin icin de ama nethodlarin disinda)
    genellikle class level variable lar class in basinda olusturulur(Sart degil)

    Class level daki verable lar icin iki scope vardir.
    1- static variables(Class Variable lari denir)
    2- instance (static olmayan) variables (obje variable lari denir)
     */

    int instSayi=20;// static olmayip class levelda oldugu icin instatnce variable dir

    static String yeni="dunya";

    int yeniSayi=35;





    public static void main(String[] args) {

        System.out.println(yeni);

        int sayi=10;
      /*  System.out.println(instSayi);
      instance variables static olmadigi icin static kulube uye main method dan direkt kullanamayiz.

      instance variable larin diger adi object variables dir. dolayisiyla obje olusturursaniz instance
      variable lari heryerden kullanabiliriz.

      -Class level instance bir variable i ayni class icerisinde static bir methodda kullanmak isterseniz
      yine obje olusturmamiz gerekir. Yine o classin objesini olusturmamiz gerekir.

       */
        C01_classInstanceVariables obje1 = new C01_classInstanceVariables();
        System.out.println("Obje1 degismeden once :"+obje1.instSayi); // 20
        obje1.instSayi=30;
        System.out.println("Obje1 degistikden sonra :"+obje1.instSayi);// 30

        C01_classInstanceVariables obje2 = new C01_classInstanceVariables();
        System.out.println("Obje2 degismeden once :"+obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("Obje2 degistikden sonra :"+obje2.instSayi);//25

        C01_classInstanceVariables obje3 = new C01_classInstanceVariables();
        System.out.println("Obje3 degismeden once :"+obje3.instSayi); //20
        /*
        Her obje olustugunda instance (obje) variable nin ilk atanan degerini alir.
         */
        C01_classInstanceVariables obje6 = new C01_classInstanceVariables();
        obje6.staticOlmayanMethod();




    }

    public static void staticMethod(){

       // System.out.println(sayi);
        /*
        Bir methodun icerisinde olusturulan variable,
        sadece o  methodun icinde kullanilabilir
        (Local Variables)
         */
        /*
        instSayi=30;
        instance variable lara main method disindaki static methodlardanda direkt ulasamayiz

        */
        C01_classInstanceVariables obje4 = new C01_classInstanceVariables();
        System.out.println(obje4.instSayi);

        //C01_classInstanceVariables obje5=new C01_classInstanceVariables();
       // System.out.println(obje5.);

        System.out.println(obje4.instSayi);


    }
    public void staticOlmayanMethod(){


        System.out.println("obje adi :"+instSayi);
        /*
        instance variable lar class icerisindeki static olmayan methodlardan direkt kullanilabilir.
         */





    }


}

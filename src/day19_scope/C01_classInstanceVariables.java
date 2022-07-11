package day19_scope;

public class C01_classLevelVariables {

    /*
    Class icinde heryerden kullanmak istediginiz variable lari
    class level'da (classin icin de ama nethodlarin disinda)
    genellikle class level variable lar class in basinda olusturulur(Sart degil)

    Class level daki verable lar icin iki scope vardir.
    1- static variables(Class Variable lari denir)
    2- instance (static olmayan) variables (obje variable lari denir)
     */

    int instSayi=20;// static olmayip class levelda oldugu icin instatnce variable dir





    public static void main(String[] args) {

        int sayi=10;
      /*  System.out.println(instSayi);
      instance variables static olmadigi icin static klube uye main main method dan direkt kullanamayiz.

      instance variable larin diger adi object variables dir. dolayisiyla obje olusturursaniz instance
      variable lari heryerden kullanabiliriz.
       */
        C01_classLevelVariables obje1 = new C01_classLevelVariables();
        System.out.println("Obje1 degismeden once :"+obje1.instSayi); // 20
        obje1.instSayi=30;
        System.out.println("Obje1 degistikden sonra :"+obje1.instSayi);// 30

        C01_classLevelVariables obje2 = new C01_classLevelVariables();
        System.out.println("Obje2 degismeden once :"+obje2.instSayi);//
        obje2.instSayi=25;
        System.out.println("Obje2 degistikden sonra :"+obje2.instSayi);

    }

    public static void staticMethod(){

       // System.out.println(sayi);
        /*
        Bir methodun icerisinde olusturulan variable,
        sadece o  methodun icinde kullanilabilir
        (Local Variables)
         */

    }
    public void staticOlmayanMethod(){

    }


}

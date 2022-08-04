package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
        Degr atamasi yapmadan bir variable kullamaya calisirsaniz Java Compile Time da bunu farkeder
        ve size izin vermez
         */
        str=null;

       // System.out.println(str.length());
        //NullPointerException

        Object obj="Java Java Java";
        Integer sayi=(Integer)obj; //ClassCastException

        /*
        String str2="Hava civa";
        Integer sayi2=str2;


        Java bazi casting islemlerine compile time da izin vermez

        Ancak bazen syntax uygun olmayabilir bu durumda java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000); //Bu kadar sure beliyor mesela burda 5 saniye





    }
}

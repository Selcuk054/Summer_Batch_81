package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Javada bilgisayarimizdaki bir dosyaya erismek istiyorsak FileInputStream Class indan yardim aliriz.
        Ayni sekilde Java dan bilgisayarimizdaki bir dosyaya ekleme yada update yapmak istersek
        FileOutputStream Class indan yardim aliriz.
         */

         FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
        /*
        Goruldugu gibi compile time da altini kirmizi cizen her durum Compile time Error degildir.
        Java da bazi exceptionlarda Compile time exceptiondur. Ozellikle
        dosya okuma ve yazma ile ilgili exceptionlar Compile time exceptiondur.

        Compile time exception olusturunda Java cozum icin iki ihtimal onerir.
        1- try catch ile cevrelemek
        2-method signature una throuws keyword ile beklenen exception turunu yazmak

        throws Excption , sadece olayin farkinda oldugumuzun deklarasyonudur
        exception un handle edilmesinde hicbir rolu yoktur
        Yani try catch ile handle ettigimiz exceptionlar da kod calismaya devam ediyordu
        Ancak throwh Exception yazdigimizda Java bir exception ile karsilasirsa
        hic birsey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.


         */

    }
}

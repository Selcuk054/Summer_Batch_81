package day34_inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {
        /*
        child class dan parent class a erisimde acces modifier kurallarini by pass edemeyiz ornegin
        parent class daki private class uyelerini child class dan kullanamayiz
        ayni sekilde parent ve child farkli package'larda ise parent class daki
        default acces modifier i olan class uyelerini child class dan kullanamayiz.
         */

        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka); //Toyota
        System.out.println(arb1.model);





    }
}

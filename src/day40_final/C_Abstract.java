package day40_final;

public abstract class C_Abstract {

    void toplama(){
        System.out.println("Bu method toplama yapar");

    }

   abstract void carpma();

    abstract void bolme();

    void cikarma(){
        System.out.println("Bu method cikarma yapar");


    }

    /*
    Bir methodun basina abstract yazarsaniz bu methodun child class lar icin bir sandart oldugunu
    declare etmis olursunuz ve method body sine ihtiyac kalmaz.

     */

}

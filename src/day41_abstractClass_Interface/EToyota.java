package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {


    @Override
    protected void motor() {
        System.out.println("Toyoa arabalar cevreci motor kullanir");
    }
    /*
    Parent class daki standart belirleyici methodlar (abstract method)lerin tamami
    child class tarafindan override edilmelidir.

    Concrete methodlarin override edilme mecburiyeti yoktur.
    istersek override ederiz istemezsek etmeyiz.

    Aslinda toyota class ida obje uretebcegimiz bir clss degil
    bu durumda eger proje tasarimi yapiyorsaniz Toyota lass ini da abstract yapmaniz guzel olur.
     */

}

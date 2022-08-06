package day41_abstractClass_Interface;

public abstract class DAraba {
    /*
    Abstract class da main method opsiyoneldir. Eger abstaract class sadece child class lari tasimak zorunda oldugu
    ozellikleri belirlemek icin olusturulduysa, main methoda ihtiyac olmaz sedece abstract method;ar olur.
    Ama bir abstract methodda standart belirlemek disinda methodlar calisabilir. bu durumda ihityac olursa main method
    olusturulabilir.


     */

    public static void main(String[] args) {

    }


    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();


    /*
    Sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen methodlar
    Abstract method olur ve abstract methodlarin body si olmaz.
     */

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        Abstract olmayan methodlara concrete method denir. (somut)
        abstract bir methodu abstract keyword ile belirtmek zorunludur.
        concrete methodlarda bunun deklare edilmesine gerek yoktur.
        Biz sadece abstraction ile ilgili konustugumuzda abstract olmayan
        methodlardan bahsetmek icin concrete tabirini kullaniriz.
         */
    }
}

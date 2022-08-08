package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da oldugumuzu dusunursek iki tane acces modifier kullanma ihtimali olamaz

    Asagidaki method da goreceginiz gibi interface de istisnai olarak body si olan methodlar olusturulabilir.
    Bu ozellik Java 8 den sonra kullanilmaya baslamistir.
     Bu ozellikten once bir interface e yeni bir method eklememiz gerektiginde eskiden beri bu
     interface i implement eden tum kclass lara gidip
     yeni eklenen methodu override etmemiz gerekirdi.

     Bu ozellik sayesinde default veya static keyword ekleyerek interface de yeni ve body si olan bir
     method olusturursak bu methodun child classlar tarafindan override edilme mecburiyeti olmaz.
     Ve eskiden implement etmis classlari degistirmemiz gerekmez.

     Bu istisnai bir durumdur ve interface icin olusturulan genel kurallari bozmaz.

     Bu methodlarin body si olsa da bunlara concrete method denmez ama override edilme mecburiyetleri yoktur.

     Buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi icindir.

     Ozaman nicin 2 keyword (static ve default ) tanimlanmistir?
     Bu iki farkli kelimenin amaci child classlardan bu method a nasil erisilebilecegini belirlemek icindir.
     static keyword kullanilirsa, child class'dan bu method a erismek icin InterfaceAdi.MethodAdi olur.

     Default keyword kullanilirsa methoda erismek icin obje olusturulmalidir.
     */

    public default void teker(){
        System.out.println("Tum arabaklarin tekeri vardir");


    }
    public static void direksiyon(){
        System.out.println("static... Tum arabalarin direksiyonu vardir");
    }
}

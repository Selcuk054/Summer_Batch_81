package day35_inheritancedaConstructorKullanimi;

public class BMemur extends BMuhasebe {
    /*
    Extends keyword kullanilan classlarda ister default constructor
    bulunsun istersek de biz yeni constructor(lar) olusturalim
    Java constructor un ilk satirina Super(); constructor call yazar

    super(); constructor call , default constructor a benzer
    gorunmesede vardir ve calisir ancak biz ilk satira farkli
    bir constructor call yazarsak Java super(); i siler
     */


    BMemur(){

        System.out.println("Memur Parametresiz Constructor");

    }
    BMemur(String isim){

        System.out.println("Memur Parametreli Constructor");
    }

    public static void main(String[] args) {
        BMemur mmr1=new BMemur();
        BMemur mmr2=new BMemur("Selcuk");
    }
    /*
    Eger bir mudahele edip constructor call imizi olusturmazsak
    Javanin default olarak olusturdugu cnstractor call parametresizdir.

     */


}

package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2)); //false

        System.out.println(sb1.equals(str));// false

        //StrinBuilderda equals methodu ancak ayni obje olursa(ayni deger)
        //true doner. Stringdeki gibi dusunmemek lazim

        System.out.println(sb1.equals(sb1));// true

        System.out.println(sb1.compareTo(sb2));// 0

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));// -4

        /*
        Compareto methodu iki stringbuilder i bastan baslayarak harf harf karsilastirir.
        ilkharfler ayni ise ikincilere gecer
        ikinciler ayni ise 3.lere gecer.
        ve ilk farkli olan harfe kadar gider farkli olan ikiharfin ascii kodlari arasindaki farki verir.

        Eger hic farkli harf yoksa sonuc olarak 0 dondurur.
         */


    }
}

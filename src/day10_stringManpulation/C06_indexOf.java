package day10_stringManpulation;

public class C06_indexOf {

    public static void main(String[] args) {
        String str= "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t")); // bana integer donduruyor.
                                              //int de yok diye bir deger bulunmuyor.
                                              // dersek J nin indexidir. - bir deger donerse biz aranan stringin str da
                                               // olmadigini anlariz. Java -1 dondurmeyi tercih etmis.\
        String str5 = "adchvgdCVkuaysghbQYWGDBXHSBKAhsbcvn ashBYQUEVXHsalj sxBXYWLVXha";

        //str 5 de p harfi varmidir?
        if (str5.indexOf("=")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else {
            System.out.println("str5'de istenen karakter kullanilmamistir");

        }
    }
}

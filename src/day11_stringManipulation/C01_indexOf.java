package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";
        // Verilen bir string de herhangi bir string veya char in ilk kullanildigi
        // indexi bize dondurur.

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); // 10

        // Eger istedigimiz inndexten sonrasini kontrol etmek istersel ozaman ayni metodu iki parametreli olarak kullanabiliriz.
        System.out.println(str.indexOf("g",(6+1))); //yazlian indexten baslar

        //yukaridaki str da 2. ve ucuncu e nin indexlerini bulun.
        // 2. e yi bulabilmek icin 1. e nin indexine ihtiyacim var.

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",(ilke+1));

        // eger 2. e varsa 3. e nin olup olmadigini
        // ve varsa indexini yazdiralim.

        if (ikincie==-1){
            System.out.println("verilen str da ikinci e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if(ucuncue==-1){
                System.out.println("verilen str'da ucuncu e yok");
            }else{
                System.out.println("verilen strdaki ucuncu e nin index'i :" +ucuncue);
            }
        }
    }
}

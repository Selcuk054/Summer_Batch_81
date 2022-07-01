package day14_methodCreation;

public class C03_methodCreation {
    public static void main(String[] args) {
        //input olarak verilen isim ve soyismi
        // ilk harfi buyuk geriye kalan harfler yildiz olacak sekilde
        // I****** K***** yazdiran method olusturun

        String isim="Enes";
        String soyisim="Bozkurt";
        ismiGizli(isim,soyisim);
    }

    public static void ismiGizli(String isim, String soyisim) {
     isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
     soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
     System.out.println(isim+" "+soyisim);




    }
}

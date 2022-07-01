package day10_stringManpulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); //bize ilk harfi yazdirir  J

        System.out.println(str.toUpperCase().charAt(7)); //7. karakteri buyuk harfe cevirip yazdiriyor, R

        System.out.println(str.charAt(21)); // l

        //System.out.println(str.charAt(22));// Senin verdigin index sinirlarin disinda oldugu hatayi verdi.

        // son harfi bulmak icin str in uzunlugunun bireksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir.

        //charAt() metodu kullandigimizda sonuc char olacagi icin artik manuplasyon yapamayiz.
        //ne yapilacaksa charAt() demeden once yapmaliyiz ve kullanmaliyiz.

    }
}

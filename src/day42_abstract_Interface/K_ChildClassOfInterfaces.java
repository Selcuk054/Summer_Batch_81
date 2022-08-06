package day42_abstract_Interface;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{

    /*
    Bir class i bir interface e child yapmak icin implements keyword kullanilir
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI);
        System.out.println(I03_Interfaces.SAYI);
        System.out.println(ISIM);
    }

}

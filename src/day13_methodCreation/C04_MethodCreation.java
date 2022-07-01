package day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen iki integer i toplayip yazdiran bir method olusturun.

        int input1 = 30;
        int input2 = 20;


        //method 4 adimda olusturulur
        // 1. adim method call
        // 2. adim argument eklenmesi geekiyorsa ekleyelim.
        //    eger methodun return type i void den farkli olacaksa bir
        //    variable olusturup method kolu assign edelim.

        topla(input1, input2);

    }

    public static void topla(int input1, int input2) {
        //3. adim method deklerasyonunda degistitrilmesi
        // gereken bolumleri degistir.(Acces modifier, return type vb..)
        // 4. adim eger return type void disinda birseyse
        // return keyword u ve donecek degeri hesaplamaliyiz.
        System.out.println("Girilen iki sayinin toplami : "+(input1+input2));

    }
}
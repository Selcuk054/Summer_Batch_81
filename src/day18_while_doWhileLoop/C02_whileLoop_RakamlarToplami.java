package day18_while_doWhileLoop;

public class C02_whileLoop_RakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu syinin rakamlari toplamini yazdirin.

        int input=3455430;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while (temp>0){

            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;

        }
        System.out.println(input+" sayisinin rakamlar toplami :"+rakamlarToplami);



    }
}

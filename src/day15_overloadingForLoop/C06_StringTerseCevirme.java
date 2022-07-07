package day15_overloadingForLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen stringi terse cevirip yazdiran bir method olusturun.

        String input="ey edip adanada pide ye";

        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {

        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);

    }
}

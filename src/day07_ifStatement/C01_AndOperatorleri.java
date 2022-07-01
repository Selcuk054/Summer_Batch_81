package day07_ifStatement;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 && c>=b);
        System.out.println(a<0 && b<20 && c>=b);// false
        /*
        Java and operatoru konusunda bize iki secenek sunar
        && kullanirsak, ilk false buldugunda, artik sonucun false olacagini bilir
        ve geriye kalan sartlari incelemez
        & kullanirsak tum sartlari kontrol eder sonra sonucu belirler
        bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir.
         */
        System.out.println(a<0 & b<20 & c>=b); // false
    }
}

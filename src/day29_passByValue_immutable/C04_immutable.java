package day29_passByValue_immutable;

public class C04_immutable {
    public static void main(String[] args) {
        /*
        Immutable: Degistirilemez
        Mutable: degistirilebilir

      En meshur Immitable class: String
         */

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());//YİLDİZ BANK

        str.toLowerCase();
        System.out.println(str);//Yildiz Bank

        str.substring(3,5);//di

        //Java da String gibi metin ifadelerde kullanabilcegimiz mutable StringBuilde class i da vardir.

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb); //YJava Bank

        sb.reverse();
        System.out.println(sb); //knaB avaJ

        sb.append(".");
        System.out.println(sb);// knaB avaJ.

    }
}

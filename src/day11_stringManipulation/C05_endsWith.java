package day11_stringManipulation;

import java.sql.SQLOutput;

public class C05_endsWith {
    public static void main(String[] args) {

        String str="Ah be Java";

        System.out.println(str.endsWith("ava"));// true

        System.out.println(str.endsWith("be Java")); //true

        System.out.println(str.endsWith("Ah be Java")); //true

        System.out.println(str.endsWith(""));

        System.out.println(str.endsWith(null));
    }
}

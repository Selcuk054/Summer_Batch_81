package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        // Bazen tek degisken soruyu cozmeye yetmez
        //*
        //**
        //***
        //****
        //*****
        //******
        //
        //yanyana 3 * yaz

        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");

        }
        System.out.println("");
        // bu tur durumlarda ic ice (nested) loop kullanmak gerekir

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

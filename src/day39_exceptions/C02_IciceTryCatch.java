package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C02_IciceTryCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

            while((k=fis.read()) !=-1) {
                System.out.print((char) k);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi yada dosya bozuk");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        }

        //IO Exception ile FileNot ... yerini degistirirsek kabul etmeyecektir cunku bir elek gibi geneli oluyor yani
        // daha ince deliklie ir elek gibi :))

    }
}

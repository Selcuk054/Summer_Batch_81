package a_MarketProjesi;

import java.util.Scanner;
import java.util.Arrays;


public class Main_Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Methodlar.menu.addAll(Arrays.asList("Manav", "Sarkuteri", "Market"));
        System.out.println("=======HOSGELDINIZ=======");
        System.out.println("Lutfen secmek istediginiz reyonu yaziniz \nMarket\nManav\nSarkuteri ");
        String reyonSecimi = scan.next();
        Methodlar.manavUrunler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"));
        Methodlar.manavfiyatlar.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
        Methodlar.marketUrunler.addAll(Arrays.asList("Un", "Makarna", "Sut", "Salca", "Zeytin yagi", "Yogurt", "Pirinc", "Yumurta", "Peynir", "Sucuk", "Zeytin"));
        Methodlar.marketfiyatlar.addAll(Arrays.asList(50.00, 12.20, 8.50, 45.30, 150.10, 5.20, 5.00, 20.10, 45.0, 40.0, 60.0));
        int secilenUrunKod;
        double secilenUrunKg;
        String cevap;
        double odenecekToplamTutar;
        if (reyonSecimi.equalsIgnoreCase("manav")) {
            do {
                Methodlar.manavUrunleriListele();
                System.out.println("Lutfen satin almak istediginiz urunun kodunu giriniz");
                secilenUrunKod = scan.nextInt();
                System.out.println("Kac kg satin almak istiyorsunuz");
                secilenUrunKg = scan.nextDouble();
                Methodlar.manavSepeteEkle(secilenUrunKod, secilenUrunKg);
                odenecekToplamTutar = Methodlar.sepetiGoster();
                System.out.println();
                System.out.println("Baska urun eklemek istiyor musunuz(EVET/HAYIR)");
                cevap = scan.next();
            } while (cevap.equalsIgnoreCase("EVET"));
            System.out.println("Alisverise market reyonunda devam etmek istiyor musunuz");
            cevap = scan.next();
            if (cevap.equalsIgnoreCase("EVET")) {
                do {
                    Methodlar.marketUrunleriListele();
                    System.out.println("Lutfen satin almak istediginiz urunun kodunu giriniz");
                    secilenUrunKod = scan.nextInt();
                    System.out.println("Kac kg satin almak istiyorsunuz");
                    secilenUrunKg = scan.nextDouble();
                    Methodlar.marketSepeteEkle(secilenUrunKod, secilenUrunKg);
                    odenecekToplamTutar = Methodlar.sepetiGoster();
                    System.out.println();
                    System.out.println("Baska urun eklemek istiyor musunuz(EVET/HAYIR)");
                    cevap = scan.next();
                } while (cevap.equalsIgnoreCase("EVET"));
            }
            Methodlar.odemeYap(odenecekToplamTutar);
        } else if (reyonSecimi.equalsIgnoreCase("market")) {
            do {
                Methodlar.marketUrunleriListele();
                System.out.println("Lutfen satin almak istediginiz urunun kodunu giriniz");
                secilenUrunKod = scan.nextInt();
                System.out.println("Kac kg satin almak istiyorsunuz");
                secilenUrunKg = scan.nextDouble();
                Methodlar.marketSepeteEkle(secilenUrunKod, secilenUrunKg);
                odenecekToplamTutar = Methodlar.sepetiGoster();
                System.out.println();
                System.out.println("Baska urun eklemek istiyor musunuz(EVET/HAYIR)");
                cevap = scan.next();
            } while (cevap.equalsIgnoreCase("EVET"));
            System.out.println("Alisverise manav reyonunda devam etmek istiyor musunuz");
            cevap = scan.next();
            if (cevap.equalsIgnoreCase("EVET")) {
                do {
                    Methodlar.manavUrunleriListele();
                    System.out.println("Lutfen satin almak istediginiz urunun kodunu giriniz");
                    secilenUrunKod = scan.nextInt();
                    System.out.println("Kac kg satin almak istiyorsunuz");
                    secilenUrunKg = scan.nextDouble();
                    Methodlar.manavSepeteEkle(secilenUrunKod, secilenUrunKg);
                    odenecekToplamTutar = Methodlar.sepetiGoster();
                    System.out.println();
                    System.out.println("Baska urun eklemek istiyor musunuz(EVET/HAYIR)");
                    cevap = scan.next();
                } while (cevap.equalsIgnoreCase("EVET"));
            }
            Methodlar.odemeYap(odenecekToplamTutar);
        }

    }
}
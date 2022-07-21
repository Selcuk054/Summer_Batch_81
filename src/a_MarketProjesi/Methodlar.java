package a_MarketProjesi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class Methodlar {
        /*
    ====================PROJEMIZ===================================
         * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
            1 manav,
            2 sarkuteri,
            3 market
            secime gor ,
            4-urunleri listele ve
            5-fiyatlari gelsin
         *
         * Basrili Market alış-veriş programı.
            1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.
                No   Ürün    Fiyat
                 ===== ======= ========
            00 Domates 2.10 TL ,
            01 Patates 3.20 TL ,
            02 Biber 1.50 TL ,
            03 Soğan 2.30 TL  ,
            04 Havuç 3.10 TL
            05 Elma 1.20 TL
            06 Muz 1.90 TL
            07 Çilek 6.10 TL
            08 Kavun 4.30 TL
            09 Üzüm 2.70 TL
            10 Limon 0.50 TL
            /*   No   Ürün    Fiyat
                 ===== ======= ========
            11 Un        50.00 TL ,
            12 Makarna   12.20 TL ,
            13 Sut        8.50 TL ,
            14 Salca      45.30 TL  ,
            15 Zeytin yagi 150.10 TL
            16 Yogurt     5.20 TL
            17 Ekmek      5 TL
            18 Yumuta     20.10 TL
            19 Peynir     45.00 TL
            20 Sucuk      40 TL
            21 Zeytin     60  TL
         * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
            * 3. Adım: Kaç kg satın almak istediğini sorunuz.
              4. Adım: Alınacak bu ürünü
         * sepete ekleyiniz ve Sepeti yazdırınız.
             5. Başka bir ürün alıp almak
         * istemediğini sorunuz.
             6. Eğer devam etmek istiyorsa yeniden ürün seçme
         * kısmına yönlendiriniz.
             7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
         * ödeme sonrasında programı bitiriniz
         */
        public static List<String> menu=new ArrayList<>();
        public static List<String> manavUrunler=new ArrayList<>();
        public static List<String> marketUrunler=new ArrayList<>();
        public static List<Double> manavfiyatlar=new ArrayList<>();
        public static List<Double> marketfiyatlar=new ArrayList<>();
        public static List<String> sepettekiUrunler=new ArrayList<>();
        public static List<Double> sepettekiKg=new ArrayList<>();
        public static List<Double> sepettekiFiyat=new ArrayList<>();
        public static void odemeYap(double odenecekToplamTutar) {
            Scanner scan=new Scanner(System.in);
            double miktar=0;
            System.out.println("Odemeniz gereken tutar :"+odenecekToplamTutar);
            do {
                System.out.println("Ne kadar paraniz var");
                miktar += scan.nextDouble();
                if (miktar < odenecekToplamTutar) {
                    System.out.println("Paraniz yetersiz ekleme yapin");
                    System.out.println("Ekleme yapacaginiz miktar=" + (odenecekToplamTutar - miktar));
                }
            }while (miktar<odenecekToplamTutar);
            System.out.println("============================");
            System.out.println("Suana kadar "+ miktar+" kadar odeme yaptiniz");
            System.out.println("Toplam borcunuz "+ odenecekToplamTutar);
            System.out.println("============================");
            System.out.println("Para ustunuz "+(miktar-odenecekToplamTutar));
        }
        public static double sepetiGoster() {
            double sepetToplamFiyat = 0;
            System.out.println("URUN ADI" + " " + "KILO" + " " + "TUTAR");
            System.out.println("====================================");
            for (int i = 0; i < sepettekiUrunler.size(); i++) {
                System.out.println(sepettekiUrunler.get(i) + "  " + sepettekiKg.get(i) +" kg "+ "  " + sepettekiFiyat.get(i)+" TL ");
                sepetToplamFiyat+= sepettekiFiyat.get(i);
            }
            System.out.println("Su ana kadar aldiginiz urunlerin toplam fiyati: "+ sepetToplamFiyat);
            return sepetToplamFiyat;
        }
        public static void manavSepeteEkle(int secilenUrunKod, double secilenUrunKg) {
            sepettekiUrunler.add(manavUrunler.get(secilenUrunKod));
            sepettekiKg.add(secilenUrunKg);
            sepettekiFiyat.add(manavfiyatlar.get(secilenUrunKod)*secilenUrunKg);
        }
        public static void manavUrunleriListele() {
            System.out.println("NO"+"   "+"URUN"+"   "+"FIYAT");
            System.out.println("=============================");
            for (int i = 0; i <manavUrunler.size() ; i++) {
                System.out.println(i+ "   " +manavUrunler.get(i)+ "    " + manavfiyatlar.get(i)+" "+"TL");
            }
        }
        public static void marketSepeteEkle(int secilenUrunKod, double secilenUrunKg) {
            sepettekiUrunler.add(marketUrunler.get(secilenUrunKod));
            sepettekiKg.add(secilenUrunKg);
            sepettekiFiyat.add(marketfiyatlar.get(secilenUrunKod)*secilenUrunKg);
        }
        public static void marketUrunleriListele() {
            System.out.println("NO"+"   "+"URUN"+"   "+"FIYAT");
            System.out.println("=============================");
            for (int i = 0; i <marketUrunler.size() ; i++) {
                System.out.println(i+ "   " +marketUrunler.get(i)+ "    " + marketfiyatlar.get(i)+" "+"TL");
            }
        }

    }

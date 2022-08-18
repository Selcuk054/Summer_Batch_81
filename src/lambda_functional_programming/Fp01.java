package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

        /*
        1-) Lambda (Functional programming) java 8 ile kullanilmaya baslamistir.
        2-) Functional programming'de ne yapilacak (What to do) uzerien yogunlasilir.
        Structured programming nasil yapilacak(How to do) uzerine yogunlasir.
        3-) Functional programming arrays ve collections ile kullanilir.
        4-) entryset () methodu ile Map, Set e donusturulerek Functional programmingde kullanilir.
         */
        public static void main(String[] args) {


            List<Integer> list = new ArrayList<>();
            list.add(8);
            list.add(9);
            list.add(131);
            list.add(10);
            list.add(9);
            list.add(10);
            list.add(2);
            list.add(8);
            System.out.println(list);

            listElemnlariniYazdirStructured(list);
            System.out.println();
            listElemnlariniYazdirFunctional(list);
            System.out.println();
            ciftElementleriYazdirStructured(list);
            System.out.println();
            ciftElementleriYazdirFunctional(list);
            System.out.println();
            tekElemanlarinKareleriniYazdirFunctional(list);
            System.out.println();
            tekElementlerinKupleriniYazdirFunctional(list);
            System.out.println();
            tekrarsizCiftElementlerinKreleriToplami(list);
            tekrarsizCiftelemanlarinKuplerinCarpimi(list);
            getMAximum(list);
            getMaximum02(list);
            getYedidenBuyukMinimum(list);
            getYedidenBuyukMinimum2(list);
            getYedidenBuyukMinimum3(list);
            getTersSiralamaTekrarsizElemanlarinYarisi(list);


    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Structured)

    public static void listElemnlariniYazdirStructured(List<Integer> list){
        for (Integer w :list){

            System.out.print(w+ " ");

        }
    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)
    public static void listElemnlariniYazdirFunctional(List<Integer>list){

            list.stream().forEach(t-> System.out.print(t +" "));//bircok mini method olusturmak icin stream()
                                                                  // ->lambda expression
        //Stream methodu collectiondan elemenleri akisa dahil etmek icin ve methodlara ulasmak icin kullanilir.
    }

    //2)Cift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElementleriYazdirStructured(List<Integer> list){
            for(Integer w:list){
                if (w%2==0){
                    System.out.print(w+ " ");
                }
        }
    }

    //2)Cift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElementleriYazdirFunctional(List<Integer> list){

            list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> kareList){

            kareList.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));

            //listedeki degerler degisecekse map() (donustur) methodu kullanilir.
    }

   //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElementlerinKupleriniYazdirFunctional(List <Integer> kupList){

            kupList.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
                    //distinct() tekrar edenleri almama methodu
    }
    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElementlerinKreleriToplami (List<Integer> list){
           Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
                    //reduce() dusurme azaltma
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftelemanlarinKuplerinCarpimi(List<Integer> list){
        System.out.println(list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u));
        // reduce ile cok fazla elemanlari tek bir eleman adonustururuz.
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.yol
    public static void getMAximum(List<Integer>list){
            Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);

    }
    //2.yol

    public static void getMaximum02(List<Integer> list){
            Integer max02=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("Max = "+max02);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)


    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1.yol

    public static void getYedidenBuyukMinimum(List<Integer> list){
           Integer minValue= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println("minValue = " + minValue);
    }

    //2.yol
    public static void getYedidenBuyukMinimum2(List <Integer> list){
         Integer min=   list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min);
        }

        //3. yol
    public static void getYedidenBuyukMinimum3 (List<Integer>list){
         Integer minValue =  list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println("minValue = " + minValue);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu)
    // bulan bir method oluşturun.

    public static void getTersSiralamaTekrarsizElemanlarinYarisi(List<Integer>list){
       List<Double> sonuc = list.stream().distinct().filter(t-> t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);
    }











}

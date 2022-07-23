package day_30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println("Time 1 : "+time1);//18:12:02.041557
        /*
        Bizim olusturdugumuz date ve time canli saat ve tarih degildir.
        LocalTime(): kullandigimiz satirda o anki tarih veya saati alip bizim variable miza store eder.
        time 1 variable inin degeri sabittir.
         */

        Thread.sleep(3000);

        LocalTime time2=LocalTime.now();
        System.out.println("Time 2 : "+time2);

    }
}

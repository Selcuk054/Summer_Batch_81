package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat); //2022-07-23T18:40:30.612493

        System.out.println(tarihSaat.plusMonths(3).minusHours(4));
        System.out.println(tarihSaat.getDayOfMonth());
        System.out.println(tarihSaat.getMonth());
        System.out.println(tarihSaat.getSecond());

        System.out.println(tarihSaat.toLocalDate());//2022-07-23



    }
}

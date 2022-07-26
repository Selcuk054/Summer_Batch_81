package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);//2022-07-23

        System.out.println(tarih.getDayOfMonth());//23
        System.out.println(tarih.getDayOfYear());//204
        System.out.println(tarih.getDayOfWeek());//Saturday
        System.out.println(tarih.atStartOfDay()); //2022-07-23T00:00

        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.lengthOfMonth());//31
        System.out.println(tarih.isLeapYear());// false

        LocalDate tarih2=LocalDate.of(2001,5,15);
        System.out.println(tarih2); //2001-05-15

        LocalDate tarih3= LocalDate.of(1990, Month.DECEMBER,23);
        System.out.println(tarih3); //1990-12-23

        System.out.println(tarih.plusDays(100));//2022-10-31
        System.out.println(tarih.plusYears(5).plusMonths(9).plusDays(56));//2028-06-18

        System.out.println(tarih.minusYears(4).minusMonths(3).minusYears(12));//2006-04-23

        System.out.println(tarih.isAfter(tarih2)); //true

        //Iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulunuz.
        //tarih 2 ve tarih 3 icin bunu yapaliim

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuktur");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2+" tarihinde dogan daha buyuktur");
        }else System.out.println("Iki tarihde ayni");


    }
}

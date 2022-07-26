package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //Iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1985,10,5);
        LocalDate Bugun=LocalDate.now();

        Period period=Period.between(tarih1, Bugun);
        System.out.println(period); //P-36Y-9M-18D

        System.out.println(period.getYears());


    }
}

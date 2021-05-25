package java8;

import java.time.*;
import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date dt = new Date(1621943866546L);
        System.out.println(dt);

        LocalDate localDate = LocalDate.now().plusDays(1);
        LocalDate localDate1 = LocalDate.now().minusDays(1);
        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2.getYear());
        System.out.println(localDate2.getMonth());


        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        System.out.println(zoneId);
        LocalDate localDate3 = LocalDate.now(zoneId);
        System.out.println(localDate3);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        LocalDate from = LocalDate.of(2020,8,12);
        LocalDate to = LocalDate.of(2021,2,14);

        Period period = Period.between(from,to);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        LocalDateTime from1 = LocalDateTime.of(2020,10,4,10,10,44);
        LocalDateTime to1 = LocalDateTime.of(2020,10,10,10,21,12);

        Duration duration = Duration.between(from1,to1);
        System.out.println(duration.toDays());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());

    }
}

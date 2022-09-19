package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Davyd
 */

public class Program {

    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-09-19");
        LocalDateTime d05 = LocalDateTime.parse("2022-09-19T18:46:23");
        Instant d06 = Instant.parse("2022-09-19T18:46:56Z");
        Instant d07 = Instant.parse("2022-09-19T18:46:13-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2014", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2014 18:57", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 9, 19, 19, 6);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03.toString());
        System.out.println("d04: " + d04.toString());
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06.toString());
        System.out.println("d07: " + d07.toString());
        System.out.println("d08: " + d08.toString());
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);



    }
}

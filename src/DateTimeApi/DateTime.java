package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        //  date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println("lt "+lt);
    }
}

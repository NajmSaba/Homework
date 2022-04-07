import java.time.LocalTime;

public class book {


    public String threeortwothousand(LocalTime time1) {
        LocalTime n = LocalTime.of(9,30,00);
        LocalTime f = LocalTime.of(16,01,00);
        LocalTime s = LocalTime.of(19,31,00);
        if (time1.isBefore(n)) {
            return "3000";
        } else if (time1.isBefore(f)) {
            return "2000";
        } else if (time1.isBefore(s)) {
            return "3000";
        } else  {
            return "2000";
        }


    }
}

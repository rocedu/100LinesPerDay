package ch13;

import static java.lang.System.out;
import java.util.Calendar;

public class CalendarUtil {
    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        birth.set(1977, Calendar.MARCH, 28);
        Calendar now = Calendar.getInstance();
        out.printf("岁数：%d%n", yearsBetween(birth, now));
        out.printf("天数：%d%n", daysBetween(birth, now));
    }
    
    public static long yearsBetween(Calendar begin, Calendar end) {
        Calendar calendar = (Calendar) begin.clone();
        long years = 0;
        while (calendar.before(end)) {
            calendar.add(Calendar.YEAR, 1);
            years++;  
        }
        return years - 1;
    }
    
    public static long daysBetween(Calendar begin, Calendar end) {
        Calendar calendar = (Calendar) begin.clone();
        long days = 0;
        while (calendar.before(end)) {
            calendar.add(Calendar.DATE, 1);
            days++;
        }
        return days - 1;
    }
}

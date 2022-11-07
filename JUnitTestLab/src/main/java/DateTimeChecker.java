import java.util.Scanner;

public class DateTimeChecker {
    static byte checkDayInMonth(short year, byte month){
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9:
                return 30;
            case 2:
                if(year % 400 == 0 ) {
                    return 29;
                } else if(year % 100 == 0) {
                    return 28;
                } else if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default: return 0;
        }
    }

    static boolean isValidDate(short year,byte month, byte day) {
        if (month > 1 && month <= 12) {
            if (day >= 1) {
                if (day <= checkDayInMonth(year, month)) {
                    return true;
                }
            }
        }
        return false;
    }
}

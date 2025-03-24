public class numberOfDayInMonth {

        public static void main(String[] args) {
            if(isLeapYear(1800))
            {
                System.out.println("Is leap year");
            }
            else
            {
                System.out.println("Is not leap year");
            }

            System.out.println(getDaysInMonth(1,-2018));
    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        } else if ((year < 1) || (year > 9999)) {
            return -1;
        } else if (isLeapYear(year)) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> {
                    yield 0;
                }
            };
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> {
                    yield 0;
                }
            };
        }
    }
}

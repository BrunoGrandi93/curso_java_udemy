public class LeapYear {
    // write code here

    public static void main(String[] args) {
        if(isLeapYear(1800))
        {
            System.out.println("Is leap year");
        }
        else
        {
            System.out.println("Is not leap year");
        }
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
}
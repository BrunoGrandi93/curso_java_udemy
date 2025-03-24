public class switchtraining {
    public static void main(String[] args) {
        int switchValue = 3;
    String month = "SEPTEMBER";
    System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1.");
//                break;
//            case 2:
//                System.out.println("Value was 2.");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, 4 or 5.");
//                System.out.println("Actually it was a " + switchValue + ".");
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5.");
//        }

        switch(switchValue) {
            case 1 -> System.out.println("Value was 1.");
            case 2 -> System.out.println("Value was 2.");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4 or 5.");
                System.out.println("Actually it was a " + switchValue + ".");
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5.");
        }
    }

    public static String getQuarter (String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3st";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4st";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}

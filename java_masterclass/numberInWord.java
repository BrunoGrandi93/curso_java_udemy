public class numberInWord {
    public static void main(String[] args) {

        printNumberInWord(-15);
    }

    public static void printNumberInWord (int number) {
        switch (number) {
            case 0 -> System.out.println(number + " is ZERO");
            case 1 -> System.out.println(number + " is ONE");
            case 2 -> System.out.println(number + " is TWO");
            case 3 -> System.out.println(number + " is THREE");
            case 4 -> System.out.println(number + " is FOUR");
            case 5 -> System.out.println(number + " is FIVE");
            case 6 -> System.out.println(number + " is SIX");
            case 7 -> System.out.println(number + " is SEVEN");
            case 8 -> System.out.println(number + " is EIGHT");
            case 9 -> System.out.println(number + " is NINE");
            default -> System.out.println(number + "is OTHER");
            }
        }
    }


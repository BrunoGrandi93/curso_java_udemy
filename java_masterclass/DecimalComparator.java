public class DecimalComparator {
    // write code here

    public static void main(String[] args) {
                System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }
}
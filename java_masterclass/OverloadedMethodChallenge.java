public class OverloadedMethodChallenge {

    public static void main(String[] args) {
        System.out.println("5ft, 8 in = " + convertToCentimeters(5,8) + " cm");
        System.out.println("68 in = " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters (int inchesNumber) {

        return inchesNumber * 2.54;
    }

    public static double convertToCentimeters (int heightFeets, int heightInches) {

        return convertToCentimeters((heightFeets * 12) + heightInches);
    }
}

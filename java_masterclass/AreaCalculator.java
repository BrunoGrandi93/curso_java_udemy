public class AreaCalculator {
    // write code here
    public static void main(String[] args) {

        System.out.println("Área do círculo = " + area(5));
        System.out.println("Área do quadrado = " + area(5,4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return (3.141592653589793 * radius * radius);
        }
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        } else {
            return (x * y);
        }
    }
}
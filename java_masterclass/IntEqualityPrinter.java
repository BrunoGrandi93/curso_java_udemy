public class IntEqualityPrinter {
    public static void main(String[] args) {
    printEqual(1,2,1);
    }
    public static void printEqual (int X, int Y, int Z) {
        if ((X<0)||(Y<0)||(Z<0)) {
            System.out.println("Invalid Value");
        } else if ((X==Y)&&(Y==Z)&&(X==Z)) {
                System.out.println("All numbers are equal");
            } else if ((X!=Y)&&(Y!=Z)&&(X!=Z)) {
                    System.out.println("All numbers are different");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            }
}

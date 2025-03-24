public class playingCat {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 25));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
       if ((summer) && (25 <= temperature) && (temperature <= 45)) {
            return true;
        } else if ((!summer) && (25 <= temperature) && (temperature <= 35)) {
            return true;
        } else {
           return false;
       }
    }
}

public class sumForLoopChallenge {

    public static void main(String[] args) {

        int countOfMarches = 0;
        int sumOfMatches = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                countOfMarches++;
                sumOfMatches += i;
                System.out.println("Found a match = " + i);
            }
            if (countOfMarches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}

public class whileLoopChallenge
{
    public static void main(String[] args)
    {
        int countEven = 0;
        int countOdd = 0;
        int testNumber = 4;
        int finishNumber = 20;

        while (testNumber <= finishNumber) {
            testNumber++;
            if (!isEvenNumber(testNumber)){
            countOdd++;
            continue;
            }
                System.out.println("Even Number " + testNumber);
            countEven++;
            if (countEven >= 5) {
                break;
            }
        }
        System.out.println("Total odd count = " + countOdd);
        System.out.println("Total even count = " + countEven);
    }
        public static boolean isEvenNumber(int number)
        {
            return number % 2 == 0;
        }
}



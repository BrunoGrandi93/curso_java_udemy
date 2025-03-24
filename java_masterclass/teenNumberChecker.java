public class teenNumberChecker {
    // write code here
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen (int ageOne, int ageTwo, int ageThree){
        if ((ageOne >= 13) && (ageOne <= 19) ||
                (ageTwo >= 13) && (ageTwo <= 19) ||
                (ageThree >= 13) && (ageThree <= 19))
        {
            return true;
        } else
        {
            return false;
        }
    }
    public static boolean isTeen (int age)
    {
        if ((age >= 13) && (age <= 19))
        {
            return true;
        } else {
            return false;
        }
    }
}


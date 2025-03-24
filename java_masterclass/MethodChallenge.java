public class MethodChallenge
{
    public static void main(String[] args)
    {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bruno",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gaby",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Lucas",highScorePosition);
    }

    public static void displayHighScorePosition (String playerName, int highScorePosition)
    {
        System.out.println((playerName + " managed to get into position " +
                highScorePosition + " on the high score list."));
    }

    public static int calculateHighScorePosition (int playerScore)
    {
        int result = 4;

        if (playerScore >= 1000)
        {
            result = 1;
        } else if (playerScore >= 500)
        {
            result = 2;
        } else if (playerScore >= 100)
        {
            result = 3;
        }
        return result;
    }
}

public class Conversion
{
    public static void main(String[] args) {
       printConversion(10.25);
    }
    // write code here
    public static long toMilesPerHour (double kilometersPerHour)
    {
        long conversion = 0;

        if (kilometersPerHour < 0)
        {
            return -1;
        } else
        {
            conversion = Math.round(kilometersPerHour / 1.609);
        }
        return conversion;
    }

    public static void printConversion (double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        } else
        {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}
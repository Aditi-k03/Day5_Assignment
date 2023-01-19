import java.util.*;

public class Harmonic_Number
{
    public static void main(String[] ars)
    {
        Scanner s = new Scanner(System.in);

        //Try and catch to not terminate at wrong input
        try
        {
            System.out.println("Enter harmonic no to find:-");
            int n = s.nextInt();
            System.out.println(harmonic(n));

        }
        catch (Exception e)
        {
            System.out.println("Enter Integer:-");
            main(ars);
        }
        s.close();
    }
    static double harmonic(int n)
    {
        double h = 1;
        for (double i = 2; i <= n; i++)
        {
            h = h + 1 / i;
        }
        return h;
    }
}

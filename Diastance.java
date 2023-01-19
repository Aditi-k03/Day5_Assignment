import java.util.*;

public class Diastance
{
    static void calculate(int x, int y)
    {
        System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args)
    {
        try
        {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter value for x:-");
            int x = s.nextInt();

            System.out.println("Enter value for y:-");
            int y = s.nextInt();

            calculate(x, y);
            s.close();
        }

        catch (Exception e)
        {
            System.out.println("Enter integer only.");
        }
    }
}

import java.util.*;

public class Power_of_2
{
    static void printTable(int pow)
    {
        int val = 1;
        for (int i = 1; i <= pow; i++)
        {
            val = val * 2;
            System.out.println(val);
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter to find power of 2 less than 32:-");
        int pow = s.nextInt();
        while (pow > 31)
        {
            System.out.println("Invalid input ");
            System.out.println("Enter value less than 32:-");
            pow = s.nextInt();
        }
        printTable(pow);
        s.close();
    }
}

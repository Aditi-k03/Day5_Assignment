import java.util.*;

public class Leap_year
{
    public static void main(String args[])
    {
        int year;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Year:- ");
        year = s.nextInt();

        if(year%4==0 && year%100!=0)
            System.out.println("\nIt is a Leap Year.");

        else if(year%400==0)
            System.out.println("\nIt is a Leap Year.");

        else
            System.out.println("\nIt is not a Leap Year.");
    }
}



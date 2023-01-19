import java.util.*;

public class Quotient_Remainder
{
    public static void main(String[] args)
    {

        int dividend , divisor, quotient, remainder;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the value of Dividend:- ");
        dividend = s1.nextInt();

        System.out.print("Enter the value of Divisor:- ");
        divisor = s1.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("The Quotient is:- " + quotient);
        System.out.println("The Remainder is:- " + remainder);
    }
}

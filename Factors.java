import java.util.*;

public class Factors
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no to find prime factors:-");
        int n = s.nextInt();

        System.out.println("Prime Factors are:- ");
        primeFactors(n);
        s.close();
    }
    public static boolean isPrime(int n)
    {
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    //Function to find the prime factors of given no and print it
    static void primeFactors(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            int t = n % i;
            if (t == 0)
            {
                if (isPrime(i))
                    System.out.println(i + " ");
            }
        }
    }
}

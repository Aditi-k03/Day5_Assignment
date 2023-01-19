import java.util.*;

public class SumOfNumberAdd
{
    public static void main(String[] args)
    {
        System.out.println("Enter no of Inputs:-");
        int n = s.nextInt();
        sum0count(n);
    }
    static Scanner s = new Scanner(System.in);

    //Function to check sum of triplets is 0
    static void sum0count(int n)
    {
        int[] arr = new int[n];
        int count = 0;
        System.out.println("Enter Values:-");

        for (int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        // checking for triplets by loop
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                for (int k = j + 1; k < arr.length; k++)
                {
                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        count++;
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
                    }
                }
            }
        }
        System.out.println("Total pairs are:- " + count);
    }
}

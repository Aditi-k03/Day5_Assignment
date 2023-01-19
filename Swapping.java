import java.util.*;

public class Swapping
{
    public static void main(String[] args)
    {
        int x = 100, y = 200;

        System.out.println("Before Swapping Elements:-");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping Elements:-");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

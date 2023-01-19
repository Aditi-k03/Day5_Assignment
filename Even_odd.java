import java.util.*;

public class Even_odd
{
    public static void main(String[] args) {

   //The input stored in num
    Scanner S = new Scanner(System.in);

    System.out.print("Enter a Number:- ");
    int num = S.nextInt();

    if(num % 2 == 0)
        System.out.println(num + " No. is Even");
    else
        System.out.println(num + " No. is Odd");
}

}

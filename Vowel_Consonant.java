import java.util.*;

public class Vowel_Consonant
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //create a scanner object for input

        System.out.println("Enter the Alphabet:-");
        char ch=scan.next().charAt(0);;// store the input from the user


        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is Vowel");
                break;
            default:
                System.out.println(ch + " is Consonant");
        }
    }
}
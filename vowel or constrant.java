import java.util.*;
class Main
{
    public static void main(String args[])
    {
        String s;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any char : ");
        s=sc.next();
        c=s.charAt(0);
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            {
                System.out.print("Vowel character");
                break;
            }
            default:
            System.out.print("Consonant character");
        }
    }
}
/*Program to find String Palindrome */
import java.util.*;

class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();
        int i,flag=0;
        for(i=0;i<=len/2;i++)
        {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                flag = 0;
                break;
}
            else {
                flag = 1;
            }
        }
        if(flag==1)
        {
            System.out.println(str + " is a palindrome");
        }
            else
            {
                System.out.println(str + " is not a palindrome");
            }
                }

    }


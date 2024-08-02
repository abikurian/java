import java.util.*;
class Odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int i=sc.nextInt();
        if(i%2==0)
        {
            System.out.println("No is even");
        }
        else
        {
            System.out.println("No is odd");
        }
    }
}
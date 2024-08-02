import java.util.*;
class leapyear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check leap year: ");
        int i=sc.nextInt();
        if(i%4==0)
        {
            System.out.println("The year is a leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
        
    }
}
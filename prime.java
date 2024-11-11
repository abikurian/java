import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime: ");
        int n = sc.nextInt();
        int count = 0, flag = 0;
        
   
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
              

            }
        }
        if(count==2)
        {
            System.out.println("The number " + n + " is prime");
        }
        else
        {
            System.out.println("The number " + n + " is not prime");
        }
    }
}

import java.util.*;

class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for fibonnaci: ");
        int n = sc.nextInt();
        int i,sum,a=0,b=1;
        for(i=0;i<n;i++)
        {
            System.out.print(a + "\t");
            sum = b + a;
            a = b;
            b = sum;
        }
        
    }    
}

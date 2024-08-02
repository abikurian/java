
import java.util.*;

class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Thrid Number");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest Number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest Number is " + b);
        } else {
            System.out.println("Largest Number is " + c);

        }

    }
}

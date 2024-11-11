import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Enter a character to check the frequency: ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) 
        {
            if (str.charAt(i) == ch) {
                count++;
            }
                }
                System.out.println("The frequency of the character is: " + count);
        }

    }

    



import java.util.Scanner;

public class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int limit=(a>b)?a:b;
        //  maximum of the two numbers
        for (int i = limit; ; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break; 

            }
        }
    }
    }


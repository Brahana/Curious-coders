
import java.util.Scanner;

public class primenocount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int count = 0;
        
        // Counting prime numbers from 1 to n
        for (int num = 1; num <= n; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        
        System.out.println(count);
      
    }
}


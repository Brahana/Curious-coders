
import java.util.*;
public class pattern9 {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       pat1(n);

    }



 public static void pat1(int n){
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    for(int i=1;i<=n-1;i++)
    {
        for(int j=1;j<=n-i+1-1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    
}
}

import java.util.*;
public class pattern10 {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       pat1(n);

    }



 public static void pat1(int n){

        
    
    for(int i=1;i<=n;i++)
    {
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
    
        for(int j=1;j<=2*i-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}

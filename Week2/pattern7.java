
import java.util.*;
public class pattern7 {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       pat1(n);

    }



 public static void pat1(int n){
    for(int i=1;i<=n;i++)
    {
        for(int j=n-i+1;j>0;j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    
}
}

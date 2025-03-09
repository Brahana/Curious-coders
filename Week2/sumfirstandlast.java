import java.util.*;

public class sumfirstandlast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int ld;
int sum=0;

ld=n%10;

if(n<10)
{
    System.out.println(n);
}

else{
        while(n>=10)
        {
            
            n=n/10;
            
     

   
        }
        sum=n+ld;
        System.out.println(sum);
   
    }
}
    

}
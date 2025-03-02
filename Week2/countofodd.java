import java.util.*;

public class countofodd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int ld=0;
int count=0;
        while(n>0)
        {
            ld=n%10;
                if (ld%2!=0)
                {
                    count++;
                }
            n=n/10;
        }

        System.out.println(count);
    }
} 
    


import java.util.*;

public class Reverseno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
long ld;
long reverse=0;
        while(n>0)
        {
            ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;
        }

        System.out.println(reverse);
    }
}
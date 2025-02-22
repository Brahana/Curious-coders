import java.util.*;

public class Prob3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstname=sc.next();
        String lastname=sc.next();

        int n=sc.nextInt();

        String full=firstname+lastname;
        for(int i=1;i<=n;i++)

        {
            System.out.println(full);
        }
    }
    
}

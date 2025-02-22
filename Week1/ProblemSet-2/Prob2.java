import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int temp=0;
      

        for(int i=1;temp<=1000;i++)
        {

            temp=n*i;

            if(temp>1000)
            {
                break;
            }
            System.out.println(temp);
        }
        
            
           

}
}

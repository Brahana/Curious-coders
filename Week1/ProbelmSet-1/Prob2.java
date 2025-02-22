import java.util.Scanner;

public class Prob2 {
  
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a+b+c==180)  

        
        {
            System.out.println("Triangle can be formed");
            
        }
        else{
            System.out.println("Triangle cannot be formed");
        }


    }
    
}

import java.util.*;
public class answer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        int n=sc.nextInt();
        int num=0;
        for(int i=0;i<n;i++)
        {
         int value=sc.nextInt();
            if(num>value)
            {
                num=value;
            }
        }
        System.out.print(num);
    
    }
}
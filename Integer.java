import java.io.*;
import java.util.*;

public class Integer {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=Integer.MAX_VALUE;
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
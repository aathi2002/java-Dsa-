import java.io.*;
import java.util.*;

public class Integer {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
		int test_case=in.nextInt();
		while(test_case-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int ans=a-b;
		    int ans3=Math.min(a,b);
		    int final2=Math.min(ans3,ans);
		    System.out.println(final2);
			System.out.println(ans3);
		}
    }
}

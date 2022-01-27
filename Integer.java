import java.io.*;
import java.util.*;

public class Integer {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
<<<<<<< HEAD
		int N=in.nextInt();
		int [] arr=new int [N];
		for (int index = 0; index < arr.length; index++) {
			arr[index]=in.nextInt();
			
=======
		int test_case=in.nextInt();
		while(test_case-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int ans=a-b;
		    int ans3=Math.min(a,b);
		    int final2=Math.min(ans3,ans);
		    System.out.println(final2);
			System.out.println(ans3);
>>>>>>> 2f1aba2fd4460528166cc3e998f02882d4525fd4
		}
		HashSet<Integer>aathi=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			aathi.add(arr[i]);
			
		}
		System.out.println(aathi.size());
	
		
    }
<<<<<<< HEAD

	

	

}
=======
}
>>>>>>> 2f1aba2fd4460528166cc3e998f02882d4525fd4

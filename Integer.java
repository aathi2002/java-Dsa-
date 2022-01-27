import java.io.*;
import java.util.*;

public class Integer {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int [] arr=new int [N];
		for (int index = 0; index < arr.length; index++) {
			arr[index]=in.nextInt();
			
		}
		HashSet<Integer>aathi=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			aathi.add(arr[i]);
			
		}
		System.out.println(aathi.size());
	
		
    }

	

	

}
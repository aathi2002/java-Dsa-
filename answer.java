import java.util.*;
public class answer{
    public static void main(String[] args) {
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
		System.out.println(aathi.size())
		int answer=aathi.size()
		System.out.println(N-answer);
	
       
}

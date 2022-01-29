import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int N=in.nextInt();
        // int [] arr=new int[N];
        // for (int i : arr) {
        //     arr[i]=in.nextInt();
            
        // }
        int[] arr={12,14,16,18,20,22};
        int target=55;
        System.out.print( Arrays.binarySearch(arr,target));
                
    }
    
}

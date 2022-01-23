
import java.util.*;



public class binarypractice{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        // Arrays.sort(arr);
        int ans=binarysearch1(arr, target);
        System.out.println(ans);

    }
    static int binarysearch1(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[end]){
            System.out.println("-1");
        }
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target==arr[mid]){
                return mid;
            }
           
       
        }
        return -1;
    }
}
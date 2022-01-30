import java.util.*;

public class findpeakmountaiinarray {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        for (int i : arr) {
            arr[i]=in.nextInt();
            
        }
        int ans=findpeakindex(arr);
        System.out.print(ans);

        
    }
    public static int findpeakindex(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        
        }
        return start;


       
    }
    
}

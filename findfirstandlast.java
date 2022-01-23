import java.util.*;

public class findfirstandlast{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    //    int N=in.nextInt();
       int oddpostion=0;
       int evenpostion=0;
    //    int [] arr=new int[N];
    //    for(int i=0;i<N;i++){
    //        arr[i]=in.nextInt();
    //    }
    int []arr={1,-1,3,0,5,6,7,6};
       for (int i = 0; i < arr.length; i++) {
           if(i%2==0){
               evenpostion=arr[i];
           }
           else{
               oddpostion+=arr[i];
           }

           
       }
       System.out.println( evenpostion);
       System.out.println(oddpostion);
   

    }

}
    


import java.util.Scanner;

public class codechefcontest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test_case=in.nextInt();
        while(test_case-->0){
            int A=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int ans1=b+c;
            if(A==ans1){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
    
}

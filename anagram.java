import java.util.Arrays;
import java.util.Scanner;
public class anagram  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);       
        String str1=in.next();
        String str2=in.next();
        int strl1=str1.length();
        int strl2=str2.length();
        int count=0;
        char []ans1=new char[strl1];
        char [] ans2=new char[strl2];
        for (int i = 0; i < ans1.length; i++) {
            ans1[i]=str1.charAt(i);
            
        }
        for (int i = 0; i < ans2.length; i++) {
            ans2[i]=str2.charAt(i);
            
        }
        if(strl1!=strl2){
            System.out.print("Given the string is not anagarom");
        }
        else{
            Arrays.sort(ans1);
            Arrays.sort(ans2);
        
            for (int i = 0; i <strl1; i++) {
                if(ans1[i]==ans2[i]){
                    count++;
                    
                }
               
                
            }
            if(count==strl1||count==strl2){
                System.out.println("given string is anagrom");
            }
            else{
                System.out.println("given string is not anagarom");
            }

        }
        
    }


    
}
//find the frequency of the character in the string format scroll the name of the person\
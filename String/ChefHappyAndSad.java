/* package codechef; // don't place package name! */

import java.util.*;
public class ChefHappyAndSad
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s=sc.next();
		    int count=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|s.charAt(i)=='u' ){
		            count++;
		            if(count==3)
		                break;
		        }
		        else
		            count=0;
		            
		    }
		    System.out.println(count>2?"Happy":"Sad");
		}
	}
}
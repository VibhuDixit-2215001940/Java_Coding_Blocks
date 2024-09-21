import java.util.*;
public class One {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ok(arr,0,"",target,0);
    }
	public static void ok(int[] arr,int i,String str,int tar,int sos){
		if(i==arr.length){
			if(sos==tar){
				System.out.println(rev(str,""));
			}
			return ;
		}
		ok(arr,i+1,str+arr[i],tar,sos+arr[i]);
		ok(arr,i+1,str,tar,sos);
	}
	public static String rev(String str,String ans){
		if(str.length()==0){
			return ans;
		}
		char x = str.charAt(str.length()-1);
		return rev(str.substring(0,str.length()-1),ans+x+" ");
	}
}

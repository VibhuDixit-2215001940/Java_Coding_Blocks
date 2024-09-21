import java.util.Scanner;

public class RainWtaerTrapping {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        for(int g=0;g<d;g++){
            int n=sc.nextInt();
            int[] jh=new int[n];
            for(int j=0;j<n;j++){
                jh[j]=sc.nextInt();
            }
        int[] rtyu=new int[n];
        rtyu[0]=jh[0];
        for(int i=1;i<rtyu.length;i++){
            rtyu[i]=Math.max(rtyu[i-1],jh[i]);
        }
        int[] zxcv=new int[n];
        zxcv[n-1]=jh[n-1];
        for(int i=n-2;i>=0;i--) {
        	zxcv[i]=Math.max(zxcv[i+1], jh[i]);
        }
        int vbnc=0;
        for(int i=0;i<n;i++) {
        	vbnc+=Math.min(rtyu[i],zxcv[i])-jh[i];
        }
        System.out.println(vbnc);
        }
    }
}

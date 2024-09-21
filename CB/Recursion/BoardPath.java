public class BoardPath {
    public static void main(String[] args) {
		int n=3;
		PrintPath(0, n, "");
	}
	public static void PrintPath(int src, int des, String ans) {
		if(src==des) {
			System.out.print(ans+" ");
			return;
		}
		if(src>des) {
			return;
		}
		for (int dice = 1; dice <=3; dice++) {
			PrintPath(src+dice, des, ans+dice);
		}
	}
}

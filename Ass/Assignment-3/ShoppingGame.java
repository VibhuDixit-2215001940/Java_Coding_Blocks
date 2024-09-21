import java.util.Scanner;
public class ShoppingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		
		int ayushCount = 0;
		int harshitCount = 0;
		int i = 1;
		for(int j = 1;j<=t;j++){
			int ayushLimit = sc.nextInt();
		int harshitLimit = sc.nextInt();
			while (true) {

				// aayush odd
				if (i % 2 != 0) {
					if (ayushCount + i <= ayushLimit) {
						ayushCount += i;
					} else {
						// aayush is not able to purchase phone
						System.out.println("Harshit");
						break;
					}
				} else { // harshit even
					if (harshitCount + i <= harshitLimit) {
						harshitCount += i;
					} else {
						// harshit is not able to purchase phone
						System.out.println("Aayush");
						break;
					}
				}
				i++;
			}
		}
		

	}

}
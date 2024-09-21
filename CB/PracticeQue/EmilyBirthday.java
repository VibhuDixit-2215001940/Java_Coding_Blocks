import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] candies = new int[N];

        for (int i = 0; i < N; i++) {
            candies[i] = scanner.nextInt();
        }

        int bestFriendCandy = findBestFriendCandy(candies);
        System.out.println(bestFriendCandy);

        scanner.close();
    }

    private static int findBestFriendCandy(int[] candies) {
        int[] candyCount = new int[candies.length + 1];
        int bestFriendCandy = 0;
        int maxCount = 0;

        for (int candy : candies) {
            candyCount[candy]++;
        }

        for (int i = 1; i < candyCount.length; i++) {
            if (candyCount[i] > maxCount) {
                maxCount = candyCount[i];
                bestFriendCandy = i;
            }
        }

        return bestFriendCandy;
    }
}

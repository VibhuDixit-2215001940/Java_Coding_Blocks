import java.util.Scanner;

public class LibraryImpasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] perks = new int[N];

        for (int i = 0; i < N; i++) {
            perks[i] = scanner.nextInt();
        }

        int impasseIndex = findImpasseIndex(perks);
        System.out.println(impasseIndex);

        scanner.close();
    }

    private static int findImpasseIndex(int[] perks) {
        int leftPerks = 0, rightPerks = 0;

        for (int perk : perks) {
            rightPerks += perk;
        }

        for (int i = 0; i < perks.length; i++) {
            rightPerks -= perks[i];

            if (leftPerks == rightPerks) {
                return i;
            }

            leftPerks += perks[i];
        }

        return -1;
    }
}

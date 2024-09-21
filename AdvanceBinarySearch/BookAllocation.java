// Book Allocation Problem
// You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

// Input format
// First line contains integer t as number of test cases.
// Next t lines contains two lines.
// For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.
// Output format
// Print the maximum number of pages that can be assigned to students.


// Example 1
// Input
// 1
// 4 2
// 12 34 67 90


// Output
// 113


// Explanation
// 1st students : 12 , 34, 67 (total = 113) 
// 2nd students : 90 (total = 90) 
// Print max(113, 90)

// Constraints
// 1 < t < 50 
// 1< n < 100 
// 1< m <= 50 
// 1 <= Ai <= 1000

import java.util.Scanner;
public class BookAllocation{
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long tc = scn.nextLong();               //TESTCASES
		while (tc > 0) {
			int nob = scn.nextInt();
			long nos = scn.nextLong();
			long[] arr = new long[nob];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextLong();
			
			System.out.println(rp(arr, nob, nos));
			tc--;
		}
	}
}

	public static long rp(long[] arr, int nob, long nos) {
		long lo = 0;
		long sum = 0;
		for (long val : arr) {
			sum += val;
		}
		long hi = sum;
		long finalAns = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (isPossible(arr, nob, nos, mid)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return finalAns;
	}
	public static boolean isPossible(long[] arr, int nob, long nos, long mid) {
		long students = 1;
		long pagesRead = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mid) {
				return false;
			}
			if (pagesRead + arr[i] <= mid) {
				pagesRead += arr[i];
			} else {
				students++;
				pagesRead = arr[i];

				if (students > nos) {
					return false;
				}
            }
		}
		return true;
	}
}
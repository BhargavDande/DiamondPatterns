/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
1           1 
1 2       2 1 
1 2 3   3 2 1 
1 2 3 4 3 2 1             */

package diamond_patterns;

import java.util.Scanner;

public class P32 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= n; r++) {
			int s = 1;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (c < n) {
					if (r >= c) {
						System.out.print(s++ + " ");
					} else {
						System.out.print("  ");
						s++;
					}
				} else {
					if (r + c >= 2 * n) {
						System.out.print(s-- + " ");
					} else {
						System.out.print("  ");
						s--;
					}
				}
			}
			System.out.println();
		}
	}
}

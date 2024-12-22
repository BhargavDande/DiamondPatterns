/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
      1       
    1 2 1     
  1 2 3 2 1   
1 2 3 4 3 2 1 
  1 2 3 2 1   
    1 2 1     
      1           */

package diamond_patterns;

import java.util.Scanner;

public class P27 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			int s = 1;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1 && r - c <= n - 1 && r + c <= 3 * n - 1) {
					if (c < n) {
						System.out.print(s + " ");
						s++;
					} else {
						System.out.print(s + " ");
						s--;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

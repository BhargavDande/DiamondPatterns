/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
      1       
    2 2 2     
  3 3 3 3 3   
4 4 4 4 4 4 4 
  5 5 5 5 5   
    6 6 6     
      7           */

package diamond_patterns;

import java.util.Scanner;

public class P25 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1 && r - c <= n - 1 && r + c <= 3 * n - 1) {
					System.out.print(r + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

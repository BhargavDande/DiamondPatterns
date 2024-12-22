/*Write a Java Program to print star pattern given below. 
Example :
input : 4
output :
* * * * 
* * *   
* *     
*       
* *     
* * *   
* * * *              */

package diamond_patterns;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= n; c++) {
				if (r + c <= n + 1 || r - c >= n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

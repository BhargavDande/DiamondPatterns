/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
      a       
    a b a     
  a b c b a   
a b c d c b a 
  a b c b a   
    a b a     
      a           */

package diamond_patterns;

import java.util.Scanner;

public class P28 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			char ch = 'a';
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1 && r - c <= n - 1 && r + c <= 3 * n - 1) {
					if (c < n) {
						System.out.print(ch++ + " ");

					} else {
						System.out.print(ch-- + " ");

					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

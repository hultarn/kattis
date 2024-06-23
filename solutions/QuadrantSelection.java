// https://open.kattis.com/problems/quadrant

package solutions;

import java.util.Scanner;

public class QuadrantSelection 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.println( x > 0 ? y > 0 ? "1" : "4" : y > 0 ? "2" : "3");
		sc.close();
	}
}

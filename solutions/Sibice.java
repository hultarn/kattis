// https://open.kattis.com/problems/sibice

package solutions;

import java.util.Scanner;

public class Sibice 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt(), H = sc.nextInt();
		
		while(N-- > 0)
			System.out.println(sc.nextInt() <= Math.sqrt(W * W + H * H) ? "DA" : "NE");			
		sc.close();
	}
}

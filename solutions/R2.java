// https://open.kattis.com/problems/r2

package solutions;

import java.util.Scanner;

public class R2 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int R1 = sc.nextInt(), R2 = sc.nextInt();
		System.out.println(R2*2-R1);			
		sc.close();
	}
}


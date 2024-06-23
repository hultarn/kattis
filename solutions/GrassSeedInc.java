// https://open.kattis.com/problems/grassseed

package solutions;

import java.util.Scanner;

public class GrassSeedInc 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		double C = sc.nextDouble(), L = sc.nextDouble(), totSQ = 0;
		
		while(L-- > 0)
			totSQ += sc.nextDouble() * sc.nextDouble();
		
		System.out.println(totSQ*C);
		sc.close();
	}
}

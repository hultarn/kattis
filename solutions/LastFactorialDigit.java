// https://open.kattis.com/problems/lastfactorialdigit

package solutions;

import java.util.Scanner;

public class LastFactorialDigit 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0)
		{
			String s = "" + factorial(sc.nextInt());
			System.out.println(s.substring(s.length() - 1, s.length()));
		}
		sc.close();
	}

	private static int factorial(int N) 
	{
		 return (1 > N) ? 1 : N * factorial(N - 1); 
	}
}
